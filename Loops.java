// import java.util.Scanner;

// public class Loops {
//     public static void main(String[] args) {
//         // for(int i=1;i<=5;i++){
//         //     System.out.println();
//         //     for(int j=1;j<=i;j++){
//         //         System.out.print("*");
//         //     }
//         // }

      
//         // for(int i=1;i<=5;i++){
//         //     System.out.println();
//         //     for(int j=1;j<=i;j+2){
//         //         System.out.print(j);
//         //     }
//         // }



        
//         //   for(char i='A';i<='D';i++){
//         //     System.out.println();
//         //     for(char j='A';j<=i;j++){
//         //         System.out.print(j+" ");
            
//         //     }
//         // }
//         // int x;
//         // for(;x<25;){
//         //   int sum=sum+x;
//         //    x=x+5;
//         // }

//         Scanner sc=new Scanner(System.in);
       
// // 

//         // int sum=0;
//         // int a;
//         // for(;sum<500;){
//         //      a=sc.nextInt();
//         //      sum+=a;
//         // }
//         // System.out.println(sum);


//         // sum of digits


//         // int n=34;
//         // int sum=0;
//         // while(n>0){
//         //     int r=n%10;
//         //     n=n/10;
//         //     sum+=r;
//         // }
//         // System.out.println(sum);


//         // reverse a number
//         // int n=345;
//         // int s=0;;
//         // while(n!=0){
//         //     int r=n%10;
//         //     s=s*10+r;
//         //     n=n/10;
//         //     }
//         // System.out.println(s);


// // there is a fixed amt within that range u  purchase  items
//         int total=500;
//         int sum=0;
//         int count=0;
//         while (sum<500) {
//             System.out.println("cost of item");
//             int a=sc.nextInt();
//             System.out.println("number of items");
//             int b=sc.nextInt();
//             int f=a*b;
//             sum+=f;

//             count++;

//         }
//         System.out.println("The count of items:"+count);
//     }
// }


class Student {
    int studentId;
    String studentName;
    String course;
    double average;
    double fee;

    // Constructor to initialize values
    Student(int id, String name, String courseName, double avg) {
        studentId = id;
        studentName = name;
        course = courseName;
        average = avg;

        // Calculate fee based on average
        if (average >= 80) {
            fee = 100000; // 1 lakh
        } else {
            fee = 175000; // 1.75 lakh
        }
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Average Marks: " + average);
        System.out.println("Fee: ₹" + fee);
    }

    public static void main(String[] args) {
        // Create a student object
        Student student1 = new Student(101, "Raju Biradar", "Computer Science", 85.5);
        Student student2 = new Student(102, "Sneha Patil", "Electronics", 75.0);

        // Display student info
        System.out.println("----- Student 1 Details -----");
        student1.displayInfo();

        System.out.println("\n----- Student 2 Details -----");
        student2.displayInfo();
    }
}
