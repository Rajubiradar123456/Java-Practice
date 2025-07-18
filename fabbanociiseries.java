public class fabbanociiseries {
    public static void main(String[] args) {
        int n=99;
        int a=0,b=1;
        
        while (a <= n) {
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
