class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m+n];
        for(int i=0,j=m;i<n;i++){
            nums1[j]=nums2[i];
            j++;
        }
        Arrays.sort(nums1);
       
        System.out.println(Arrays.toString(nums1));
    }
  public static void main(String args[]){
    int nums1={1,2,3,0,0,0};
    int nums2={2,3,4};
    int m=6;
    int n=3;
    merge(nums1,m,nums2,n);
}


