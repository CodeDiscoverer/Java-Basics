package InterfacePKG;

import java.util.Scanner;

interface OfficialData {
    void getOfficialData();
}

interface PersonalData {
    void getPersonalData();
}

class Data implements OfficialData, PersonalData {

    long contactNo;
    String name, rollNo, bloodGroup, department, DOB;

    @Override
    public void getOfficialData() {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = read.nextLine();
        System.out.print("Enter your Roll Number: ");
        rollNo = read.nextLine();
        System.out.print("Enter your Department: ");
        department = read.nextLine();

        //read.close();
    }

    @Override
    public void getPersonalData() {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your Blood Group: ");
        bloodGroup = read.nextLine();
        System.out.print("Enter your Date of Birth: ");
        DOB = read.nextLine();
        System.out.print("Enter your Contact Number: ");
        contactNo = read.nextLong();

        //read.close();
    }

    public void displayData() {
        System.err.println("-------------------------------------");
        System.err.println("Hello, " + name + "! Your details are listed below...");
        System.err.println("-------------------------------------");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Blood Group: " + bloodGroup);
    }
}
