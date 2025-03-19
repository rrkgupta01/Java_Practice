
// Rotate an array by Kth Step.
import java.util.*;
public class RotateArray {
    public static void rotate(int nums[],int start,int end){
        while (start<end){
             int temp = nums[start];
             nums[start] = nums[end];
             nums[end] = temp;
             start++;
             end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        int len=arr.length-1;
        int s=0;
        rotate(arr,s,len);
        rotate(arr,s,k-1);
        rotate(arr,k,len);
        System.out.println(Arrays.toString(arr));
        
    }

}
