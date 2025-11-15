 import java.util.Scanner;

public class CRC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            // Read original data bits
            System.out.print("Enter the number of data bits: ");
            int dataSize = scan.nextInt();
            int[] data = new int[dataSize];
            System.out.println("Enter data bits (space separated, 0 or 1):");
            for (int i = 0; i < dataSize; i++) {
                data[i] = scan.nextInt() == 0 ? 0 : 1;
            }

            // Read divisor (generator) bits
            System.out.print("Enter the number of divisor (generator) bits: ");
            int divisorSize = scan.nextInt();
            if (divisorSize < 2) {
                System.out.println("Divisor size must be at least 2.");
                return;
            }
            int[] divisor = new int[divisorSize];
            System.out.println("Enter divisor bits (space separated, 0 or 1):");
            for (int i = 0; i < divisorSize; i++) {
                divisor[i] = scan.nextInt() == 0 ? 0 : 1;
            }

            // Generate CRC (remainder)
            int[] remainder = modulo2Division(data, divisor);
            System.out.print("Generated CRC bits: ");
            for (int b : remainder) System.out.print(b);
            System.out.println();

            // Form codeword (data + CRC)
            int[] codeword = new int[data.length + remainder.length];
            System.arraycopy(data, 0, codeword, 0, data.length);
            System.arraycopy(remainder, 0, codeword, data.length, remainder.length);

            System.out.print("Codeword to be sent: ");
            for (int b : codeword) System.out.print(b);
            System.out.println();

            // Simulate receiver: ask for received bits and check
            System.out.println("\n--- Receiver side check ---");
            System.out.println("Enter received codeword bits (should be " + codeword.length + " bits):");
            int[] received = new int[codeword.length];
            for (int i = 0; i < received.length; i++) {
                received[i] = scan.nextInt() == 0 ? 0 : 1;
            }

            int[] checkRemainder = modulo2Division(received, divisor);
            boolean error = false;
            for (int b : checkRemainder) {
                if (b != 0) { error = true; break; }
            }

            if (error) {
                System.out.println("Corrupted data received.");
                System.out.print("Remainder: ");
                for (int b : checkRemainder) System.out.print(b);
                System.out.println();
            } else {
                System.out.println("Data received without any error.");
            }

        } finally {
            scan.close();
        }
    }

    /**
     * Performs modulo-2 division (binary polynomial division) of data by divisor.
     * Returns remainder bits (length = divisor.length - 1).
     *
     * Algorithm:
     *  - Create a temporary array = data + zeros (divisor.length - 1)
     *  - For i from 0 to data.length-1:
     *      if temp[i] == 1 then XOR temp[i..i+divisor.length-1] with divisor[]
     *  - The remainder is the last (divisor.length - 1) bits of temp
     */
    static int[] modulo2Division(int[] originalData, int[] divisor) {
        int n = originalData.length;
        int k = divisor.length;
        int[] temp = new int[n + k - 1];

        // copy original data then appended zeros
        System.arraycopy(originalData, 0, temp, 0, n);
        for (int i = n; i < temp.length; i++) temp[i] = 0;

        for (int i = 0; i < n; i++) {
            if (temp[i] == 1) { // only if a 1, perform XOR with divisor
                for (int j = 0; j < k; j++) {
                    temp[i + j] = temp[i + j] ^ divisor[j];
                }
            }
        }

        // remainder is last k-1 bits
        int[] remainder = new int[k - 1];
        System.arraycopy(temp, n, remainder, 0, k - 1);
        return remainder;
    }
}
