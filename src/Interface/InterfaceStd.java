package Interface;

//Interface defining methods for getting official and personal details
interface StudentDetails {
    String getName();
    String getDegree();
    int getRollNo();
    String getDepartment();

    int getPersonalRollNo();
    String getContactNo();
    String getBloodGroup();
}

//Class implementing the StudentDetails interface
class Student implements StudentDetails {
    private final String name;
    private final String degree;
    private int rollNo;
    private String department;

    private int personalRollNo;
    private String contactNo;
    private String bloodGroup;

    // Constructor
    public Student(String name, String degree, int rollNo, String department,
                   int personalRollNo, String contactNo, String bloodGroup) {
        this.name = name;
        this.degree = degree;
        this.rollNo = rollNo;
        this.department = department;
        this.personalRollNo = personalRollNo;
        this.contactNo = contactNo;
        this.bloodGroup = bloodGroup;
    }

    // Implementing interface methods
    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public int getPersonalRollNo() {
        return personalRollNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }
}

//Main class to demonstrate usage
public class InterfaceStd {
    public static void main(String[] args) {
        // Creating a student object
        Student student = new Student("John Doe", "Bachelor of Science", 12345, "Computer Science",
                6789, "123-456-7890", "AB+");

        // Getting and printing official details
        System.out.println("Official Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Degree: " + student.getDegree());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Department: " + student.getDepartment());

        // Getting and printing personal details
        System.out.println("\nPersonal Details:");
        System.out.println("Roll No: " + student.getPersonalRollNo());
        System.out.println("Contact No: " + student.getContactNo());
        System.out.println("Blood Group: " + student.getBloodGroup());
    }
}


