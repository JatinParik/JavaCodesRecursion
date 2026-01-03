import java.util.Scanner;

public class ReversingAStringUsingRecursion {
    
    static String reverseString(String s, int idx) {
        if(idx==s.length()) return ""; 
        return reverseString(s, idx+1) + s.charAt(idx);
    }

    static String reverseString2(String s) {
        if(s.equals("")) return "";
        return s.charAt(s.length()-1) + reverseString2(s.substring(0,s.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to be reversed : ");
        String s = sc.nextLine();
        System.out.println(reverseString(s, 0));
        System.out.println(reverseString2(s));
    }
}
