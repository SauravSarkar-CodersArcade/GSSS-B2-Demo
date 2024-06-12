package com.gsss.batch2.advanced.oops.association;
public class Patient {
    String patientName;
    int patientAge;
    String disease;
    String doa;
    Information info;
    Payment pay;
    Patient(String patientName, int patientAge,
            String disease, String doa, Information info,
            Payment pay){
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.disease = disease;
        this.doa = doa;
        this.info = info;
        this.pay = pay;
    }
    void patientDetails(){
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Patient Age: " + this.patientAge);
        System.out.println("Disease: " + this.disease);
        System.out.println("Date Of Arrival: " + this.doa);
        System.out.println("Block Number: " + this.info.blockNo);
        System.out.println("Floor Number: " + this.info.floorNo);
        System.out.println("Room Number: " + this.info.roomNo);
        System.out.println("Bed Number: " + this.info.bedNo);
        System.out.println("Admission Fees: " + this.pay.admFees);
        System.out.println("Registration Fees: " + this.pay.regFees);
        System.out.println("Balance Amount: " + this.pay.balAmt);
    }
}
class PatientInformation {
    public static void main(String[] args) {
        Information info1 = new Information(
                "A", 3, 301, 2
        );
        Information info2 = new Information(
                "B", 2, 201, 5
        );
        Payment pay1 = new Payment(5000, 10000,
                2000);
        Payment pay2 = new Payment(6000, 9000,
                5000);
        Patient p1 = new Patient(
                "XYZ", 21, "Malaria",
                "11/06/2024", info1, pay1
        );
        Patient p2 = new Patient(
                "ABC", 21, "Malaria",
                "11/06/2024", info2, pay2
                );
        p1.patientDetails();
        p2.patientDetails();
    }
}
