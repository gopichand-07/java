class Doctor {
    void consultationFee() {
        System.out.println("General doctor consultation fee: ₹500");
    }
}

class Dentist extends Doctor {
    void consultationFee() {
        System.out.println("Dentist consultation fee: ₹700");
    }
}

class Cardiologist extends Doctor {
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: ₹1000");
    }
}

public class DoctorTest {
    public static void main(String[] args) {
        Doctor d1 = new Doctor();
        Doctor d2 = new Dentist();
        Doctor d3 = new Cardiologist();

        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
    }
}

