import java.io.*;

// Student class implementing Serializable to enable serialization
class Student implements Serializable {
    // Add serialVersionUID for version control of serialized data
    private static final long serialVersionUID = 1L;
    
    private int roll;
    private String name;
    private String address;
    private String college;
    
    // Constructor
    public Student(int roll, String name, String address, String college) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.college = college;
    }
    
    // Getters
    public int getRoll() {
        return roll;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getCollege() {
        return college;
    }
    
    @Override
    public String toString() {
        return "Roll: " + roll + 
               "\nName: " + name + 
               "\nAddress: " + address + 
               "\nCollege: " + college + "\n";
    }
}

public class StudentFile {
    public static void main(String[] args) {
        // Create three student objects
        Student student1 = new Student(101, "Aarav Sharma", "Jhapa", "ABC College");
        Student student2 = new Student(102, "Priya Adhikari", "Kathmandu", "XYZ College");
        Student student3 = new Student(103, "Suman Rai", "Jhapa", "PQR College");
        
        // Serialize the student objects to student.txt
        try {
            FileOutputStream fileOut = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            // Write each student object to the file
            out.writeObject(student1);
            out.writeObject(student2);
            out.writeObject(student3);
            
            // Close the streams
            out.close();
            fileOut.close();
            System.out.println("Successfully serialized 3 student records to student.txt");
            
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
            e.printStackTrace();
        }
        
        // Display students from Jhapa
        System.out.println("\nDisplaying students from Jhapa:");
        System.out.println("=============================");
        
        try {
            FileInputStream fileIn = new FileInputStream("student.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            // Try to read objects until EOF is encountered
            try {
                boolean foundJhapa = false;
                while (true) {
                    Student student = (Student) in.readObject();
                    if ("Jhapa".equals(student.getAddress())) {
                        System.out.println(student);
                        foundJhapa = true;
                    }
                }
            } catch (EOFException e) {
                // End of file reached, do nothing
            }
            
            // Close the streams
            in.close();
            fileIn.close();
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
            e.printStackTrace();
        }
    }
}