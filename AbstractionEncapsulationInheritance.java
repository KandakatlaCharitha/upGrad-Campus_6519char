//Write a program on real time health care industry using key java  concepts Constructors Abstraction,Encapsulation and Inheritance

// Abstract class representing a Person

abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {//Parameterized constructor for Person class
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();
}

// Encapsulated class representing a Patient
class Patient extends Person {
    private String medicalHistory;  //Private keyword which ensures the instance of the class cannot be created outside of this class

    public Patient(String name, int age, String medicalHistory) {
        super(name, age);
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation: Getters and Setters for private fields
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Inheritance: Overriding the displayDetails method
    public void displayDetails() {
        System.out.println("Patient Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medical History: " + medicalHistory);
    }
}

// Inherited class representing a Doctor
class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    // Encapsulation: Getter for private field
    public String getSpecialization() {
        return specialization;
    }

    // Inheritance: Overriding the displayDetails method
    public void displayDetails() {
        System.out.println("Doctor Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
    }

    // Healthcare service method
    public void provideHealthcareService(Patient patient) {
        System.out.println(name + " is providing healthcare service to " + patient.name);
        // Additional healthcare service logic can be added here
    }
}

// Another Encapsulated class representing a Hospital
class Hospital {
    private String name;

    public Hospital(String name) {
        this.name = name;
    }

    public void admitPatient(Patient patient) {
        System.out.println(patient.name + " is admitted to " + name);
        // Additional admission logic can be added here
    }
}
public class AbstractionEncapsulationInheritance{
    public static void main(String[] args) {
        // Creating instances of Patient, Doctor, and Hospital
        Patient patient = new Patient("Raj", 27, "Chronic Condition");
        Doctor doctor = new Doctor("Dr. Samrat", 45, "Cardiologist");
        Hospital hospital = new Hospital("City General Hospital");

        // Displaying details
        patient.displayDetails();
        System.out.println("------------");
        doctor.displayDetails();
        System.out.println("------------");

        // Hospital admitting patient
        hospital.admitPatient(patient);

        // Doctor providing healthcare service to the patient
        doctor.provideHealthcareService(patient);
        
    }
}