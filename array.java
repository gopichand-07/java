 class array {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 4;
        numbers[3] = 9;
        numbers[4] = 16;
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println("Element at index "+ i + ":" + numbers[i]);
        }

    }
    
}
