
class LinerSearch {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        int search=7;
        int index=LinerSearch(array,search);
        if(index==-1){
            System.out.print("Element is not present.");
        } else
            System.out.print("Index of "+search+" element is "+index);
        
        
    }
          public static int LinerSearch(int arr[],int k){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==k) return i;
            }
            return -1;
        }
    
}
