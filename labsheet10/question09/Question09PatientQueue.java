package labsheet10.question09;

import java.util.LinkedList;
import java.util.Queue;

public class Question09PatientQueue {
    private Queue<Patient> patients = new LinkedList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public Patient servePatient() {
        return patients.poll();
    }

    public static void main(String[] args) {
        Question09PatientQueue manager = new Question09PatientQueue();
        manager.addPatient(new Patient(1, "Aarav"));
        manager.addPatient(new Patient(2, "Neha"));
        manager.addPatient(new Patient(3, "Ravi"));

        Patient patient;
        while ((patient = manager.servePatient()) != null) {
            System.out.print("Serving: ");
            patient.display();
        }
    }
}
