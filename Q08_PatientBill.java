// Q8. Patient Bill: private fees with setters; total calculated inside the class
class PatientBill {
    private double consultationFee;
    private double medicineFee;
    private double roomFee;

    void setConsultationFee(double fee) { consultationFee = fee; }
    void setMedicineFee(double fee)     { medicineFee = fee; }
    void setRoomFee(double fee)         { roomFee = fee; }

    double calculateTotal() {
        return consultationFee + medicineFee + roomFee;
    }

    void showBill() {
        System.out.println("Consultation: " + consultationFee);
        System.out.println("Medicine:     " + medicineFee);
        System.out.println("Room:         " + roomFee);
        System.out.println("Total:        " + calculateTotal());
    }
}

public class Q08_PatientBill {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();
        bill.setConsultationFee(500);
        bill.setMedicineFee(750);
        bill.setRoomFee(2000);
        bill.showBill();
    }
}
