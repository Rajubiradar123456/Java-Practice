import java.util.Scanner;

public class Discountproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();

          int total=s*452;
            
        if(total>5000){
          
            double dis=0.3*total;
            System.out.println(total-dis);

        }
        else{
            double disc=0.1*total;
            System.out.println(total-disc);
        }


    }
}
