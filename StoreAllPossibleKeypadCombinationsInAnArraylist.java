import java.util.ArrayList;
import java.util.Scanner;

public class StoreAllPossibleKeypadCombinationsInAnArraylist {
    
    static ArrayList<String> storeComb(String in, String[] kp) {    //kp -> Keypad
        if(in.length()==0) {               //Base Case
            ArrayList<String> l = new ArrayList<>();
            l.add("");
            return l;
        }
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> smallAns = storeComb(in.substring(1), kp);   //Sub Problem
        String s = kp[in.charAt(0) - '0'];
         for(int j = 0; j<s.length(); j++) {
            for(String ss : smallAns) {
                ans.add(s.charAt(j) + ss);
            }
         }
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String containing digits from 2 to 9 : ");
        String in = sc.next();   //Input string
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> ans = storeComb(in, kp);
        System.out.println(ans);
    }
}
