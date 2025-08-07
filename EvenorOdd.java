public class EvenorOdd {
    public static void evenorodd(int n){
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void positiveorneg(int n){
        if(n<0){
            System.out.println("negative");
        }else{
            System.out.println("positive");
        }
    }
    public static void main(String[] args) {
        evenorodd(45);
        positiveorneg(45);
    }
    
}
