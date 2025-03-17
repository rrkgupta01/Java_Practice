// Find the Maximum product of two Integer from an array.

import java.util.*;
class Maxprod {
    public static void main(String[] args) {
        
        int arr[] ={1,2,2,3,1,4,5,2};
        Arrays.sort(arr);
        int len=arr.length-1;
    
             System.out.println("Maximum product of two Integer from array is = "+ arr[len]*arr[len-1]);
            
        }
        
       
    }
