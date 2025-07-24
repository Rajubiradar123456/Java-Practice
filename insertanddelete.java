// public class insertanddelete {
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40};
//         int newarr[]=new int[arr.length+1];
//         int ele=60;
//         int pos=2;
//         for(int i=0,j=0;i<newarr.length;i++){
//             if(i==pos){
//                 newarr[i]=ele;
//             }else{
//                 newarr[i]=arr[j++];
//             }
//         }

//         // delete
//         int ind=1;
//         for(int i=ind;i<arr.length-1;i++){
//             arr[i]=arr[i+1];
//         }
//         for(int i=0;i<arr.length-1;i++){
//             System.out.print(arr[i]+" ");
//         }

//         System.out.println();

//         // print
//         for(int i=0;i<newarr.length;i++){
//             System.out.print(newarr[i]+" ");
//         }
//     }
// }


public class insertanddelete {

    public static int[] addelement(int arr[],int element,int pos){
        int newarr[]=new int[arr.length+1];

        for(int i=0,j=0;i<arr.length+1;i++){
            if(i==pos){
                newarr[i]=element;
            }
            else{
                newarr[i]=arr[j++];
            }
        }
        return newarr;
    }
    public static int[] delete(int arr[],int pos){
        if(pos<0 || pos>=arr.length){
                System.out.println("element does not exist");
                return arr;
            }
         int newarr[]=new int[arr.length-1];
         
         for(int i=0,j=0;i<arr.length;i++){
            if(i==pos){
                continue;
            }

            newarr[j++]=arr[i];

         }
         return newarr;
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.print("Original array:");
        display(arr);

        // Insert 16 at position 2
        arr = addelement(arr, 16, 2);
        System.out.print("After inserting 16 at position 2:");
        display(arr);


        arr = delete(arr, 4);
        System.out.print("After deleting element at position 4:");
        display(arr);




    }
}