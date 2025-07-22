public class Dividethearrayevenorodd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int even=0;
        int odd=0;
        int evenarr[]=new int[arr.length];
        int oddarr[]=new int[arr.length];

       for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenarr[even++]=arr[i];

                // or 
                // evenarr[even]=arr[i];
                // even++;
            }
            else{
                oddarr[odd++]=arr[i];
            }
       }
       System.out.println();
       for(int i=0;i<even;i++){
        System.out.print(evenarr[i]+" ");

       }
       System.out.println();
       for(int i=0;i<odd;i++){
        System.out.print(oddarr[i]+" ");
       }

       
    }
}
