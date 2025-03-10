
import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,4,5,2,1,6,3,52,7,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the key");
        int k=sc.nextInt();
        int index=binary(arr, k);
        if (index>0) {
            System.out.println("Key of the element "+ index);
        }
        else
        {  System.out.println("Element not found");
    }
    }
    public static int binary(int ar[],int key){ 
        int end=ar.length; //8
        int start=0;//0
         
         while (start < end){
             int mid=start+(end-start)/2; 
            if(ar[mid]==key){
                return mid;
            }
            if(ar[mid]<key){ 
                start=mid+1; 
            }
            else
            {end=mid-1;}

        }
       return -1;

    }

}
