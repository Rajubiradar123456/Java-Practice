// factorial of 1/2! + 2/4! + 3/9!

public class Factorialseries {
    public static void main(String[] args) {
        // System.out.println(factorial(5));
        System.out.print(series(3));
    }
    public static double series(int n){
    double k= 1.0 /factorial(2);
    for(int i=2;i<=n;i++){
        int s=i*i;
        k+=(double)i/factorial(s);
    }
    return k;
}

    public static double factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
         return n*factorial(n-1);
    }
    
}
