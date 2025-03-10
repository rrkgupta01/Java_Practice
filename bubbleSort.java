/******************************************************************************

*******************************************************************************/

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int arr[]={2,4,5,2,1,6,3,52,7,8};
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        
       bubbleSorting(arr);
         System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    
    }
    public static void bubbleSorting(int ar[]){ 
        int n=ar.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    
                }
            }
        }
    }
}
