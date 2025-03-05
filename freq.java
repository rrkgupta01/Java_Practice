import java.util.Arrays;
public class freq {
    public static void main(String[] args) {
        String s[]= new String[] {"Pen","pen","Pencil",};
        int n= s.length;
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i]==true) {
                continue;
            }
            int count =1;
            for(int j=i+1;j<n;j++){
                
                if(s[i].equalsIgnoreCase(s[j])){
                    visited[j]=true;
                    count++;
                }
            }

            System.out.println(s[i] + " occurs " + count +" times ");
        }
        



    }

}
