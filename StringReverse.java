
public class StringReverse{
     public static void main(String[] args) {
        String s="";
        rev(s);
    }
    private static void rev(String s) {
        if(s.isBlank())
        throw new UnsupportedOperationException("No value in String");
        StringBuilder sb =new StringBuilder();
          for(char ch:s.toCharArray()){
            sb.append(ch);    
        }
        System.out.println(sb.reverse().toString());

    }
}
