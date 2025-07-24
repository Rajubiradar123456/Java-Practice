import java.util.Scanner;

public class Genderproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o=sc.nextLine();
        int days=sc.nextInt();
     if(o.equals("m")){
        System.out.println(days*350);

     }  
     else if(o.equals("f")){
        System.out.println(days*400);
     }
     else{
        System.out.println("not consider");
     }
    }
}
