public class factorialwithoutrecursion {
    public static void main(String[] args) {
        int a=5;
        int fact=1;
        for(int i=a;i>0;i--){
            fact*=i;

        }
        System.out.println(fact);
    }
}
