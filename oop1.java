package oopsinjava;


class Student{
    int rno;
    String name;
    float marks;

    void greetings(){
        System.out.println("hello my name is:"+name);
    }
    void changename(String newname){
        name=newname;
        // or 
        // this.name=newname;
    }


Student(){
    this.rno=13;
    this.name="raj";
    this.marks=34;

  // or
// Student(int roll,String names,float mark){
    // this.rno=roll;
    // this.name=names;
    // this.marks=mark;
}
}

public class oop1 {
    public static void main(String[] args) {


        // Student kunal=new Student(12,"raj",80);

        // or 
        Student kunal=new Student();
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        kunal.changename("ramu");
        kunal.greetings();
     
      }
}
    
