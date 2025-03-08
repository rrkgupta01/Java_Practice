import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
	    public static void main(String[] args) throws IOException {
	    	System.out.println("Enter the string");
	     Scanner sc=new Scanner(System.in);
	     
	        String s = sc.nextLine();
	        System.out.println(pangrams(s));

	    }

		private static String pangrams(String s) {
			// TODO Auto-generated method stub
			 s=s.toLowerCase();
			    HashSet<Character> h=new HashSet<>();  
			    for(char ch: s.toCharArray()){
			       h.add(ch);
			    }
			    //System.out.println(h.size());
			    if(h.size()==27){
			       return "pangram";
			    }
			    else
			    { return "not pangram";
			    }

			
		}

		
	}
