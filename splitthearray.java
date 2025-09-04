public class splitthearray {
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
    //     int n=arr.length/2;
    //     int arr1[]=new int[n];
    //     int arr2[]=new int[n+1];
    //     for(int i=0;i<arr1.length;i++){
    //         arr1[i]=arr[i];
    //     }
    //     for(int i=0;i<arr2.length;i++){
    //         arr2[i]=arr[n+i];
    //     }
    //     // printing array1
    //     for(int i=0;i<arr1.length;i++){
    //         System.out.print(arr1[i]+" ");
    //     }
    //     System.out.println();

    //     // printing array2
    //     for(int i=0;i<arr2.length;i++){
    //         System.out.print(arr2[i]+" ");
    //     }
    // }


    // or

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int mid=arr.length/2;
        int arr1[]=new int[mid];
        int arr2[]=new int[arr.length-mid];
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }

        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[mid+i];
        }


         System.out.print("First Half: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Print second half
        System.out.print("\nSecond Half: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
