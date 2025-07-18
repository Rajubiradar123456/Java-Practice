public class Arrayseparation{
    public static void arrayseparte(int arr[]){
        int arr1[]=new int[15];
         int arr2[]=new int[15];

         int even=0;
         int odd=0;

         for(int i=0;i<arr.length;i++){
            if(arr[i] % 2==0){
                arr1[even++]=arr[i];
            }else{
                arr2[odd++]=arr[i];
            }
        }

        for(int i=0;i<even;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
         for(int i=0;i<odd;i++){
            System.out.print(arr2[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        arrayseparte(arr);
    }
}