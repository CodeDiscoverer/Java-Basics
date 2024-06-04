package Interface;

import java.util.Scanner;

interface PersonalData{
    void getPersonalData();
}

interface OfficialData{
    void getOfficialData();
}

class Data implements PersonalData, OfficialData{

    int contactNo;
    String name, rollNo, bloodGroup, department, DOB;

    @Override
    public void getOfficialData() {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = read.nextLine();
        System.out.print("Enter your Roll Number: ");
        rollNo = read.next();
        System.out.print("Enter your Department: ");
        department = read.nextLine();

        read.close();
    }

    @Override
    public void getPersonalData() {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your Blood Group: ");
        bloodGroup = read.next();
        System.out.print("Enter your Date of Birth: ");
        DOB = read.nextLine();
        System.out.print("Enter your Contact Number: ");
        contactNo = read.nextInt();

        read.close();
    }

    public void displayData(){
        System.err.println("Hello, " + name + "! Your details are listed below");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Blood Group: " + bloodGroup);
    }
}

public class StudentData {
    public static void main(String[] args) {

        Data d = new Data();

        d.getOfficialData();
        d.getPersonalData();
        d.displayData();

    }
}
