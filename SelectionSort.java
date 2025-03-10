/******************************************************************************

*******************************************************************************/

import java.util.Arrays;
import java.util.Scanner;


public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={2,4,5,2,1,6,3,52,7,8};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        
       selectionSorting(arr);
         System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    
    }
    public static void selectionSorting(int ar[]){ 
        int n=ar.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key=ar[i];
                if(key<ar[j]){
                    int temp=ar[j];
                    ar[j]=key;
                    ar[i]=temp;
                    
                }
            }
        }
    }
}
