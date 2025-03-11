/*
You are given a signal as a string of zeros and ones, return the length of the longest sequence of ones.
Example
Input:
0110111001011110000000011
Expected output:
4
*/

public class RepeatingOnes
{
	public static void main(String[] args) {
	    String s="000001110110011110001100";
		int count =0;
		int maxcount=0;
      
        for(char ch: s.toCharArray()){
            if(ch=='1'){
                count=count+1;
            }
            else{
                if(maxcount<count){
                    maxcount=count;
                }
            count=0;
            }
        }
        System.out.println(maxcount);   
	}
}
