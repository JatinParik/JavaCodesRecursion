import java.util.Scanner;
import java.util.ArrayList;

public class StoreSubsequencesInAArrayList {
    
    static ArrayList<String> returnSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0) {
            ans.add("");
            return ans;
        }
        ArrayList<String> smallAns = returnSSQ(s.substring(1));
        for(String ss : smallAns) {
            ans.add(s.charAt(0) + ss);
        } 
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.next();
        System.out.println(returnSSQ(s));
    }
}
