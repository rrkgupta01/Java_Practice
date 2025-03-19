import java.util.*;
class BinarySearc {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,10,6,-1,7};
        int search=7;
        Arrays.sort(array);
        int index=BinarySearch(array,search);
        if(index==-1){
            System.out.print("Element is not present.");
        } else
            System.out.print("Index of "+search+" element is "+index);
    }
          public static int BinarySearch(int arr[],int k){
              int l=0;
              int h=arr.length;
              int mid;
            while(l<h){
                mid=(l+h)/2;
                if(arr[mid]==k) return mid;
                else if(k<arr[mid]) return h=mid-1;
                else l=mid+1;
            }
            return -1;
        }
    
}
