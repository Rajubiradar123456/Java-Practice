public class Student {

    int studentId;
    String studentName;
    String course;
    double average;
    double fee;
    Student(int id, String name, String courseName, double avg) {
        this.studentId=id;
        studentName = name;
        course = courseName;
        average = avg;

        if (average >= 80) {
            fee = 100000; 
        } else {
            fee = 175000; 
        }
    }

    
    void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Average Marks: " + average);
        System.out.println("Fee: ₹" + fee);
    }

    public static void main(String[] args) {
       
        Student student1 = new Student(101, "Raju Biradar", "Computer Science",85.5);
        Student student2 = new Student(102, "Sneha Patil", "Electronics", 75.0);
        System.out.println("----- Student 1 Details -----");
        student1.displayInfo();

        System.out.println("\n----- Student 2 Details -----");
        student2.displayInfo();
    }
}


