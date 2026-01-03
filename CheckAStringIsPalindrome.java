import java.util.Scanner;

public class CheckAStringIsPalindrome {

    static String reverseString(String s) {
        if(s.equals("")) return "";
        return s.charAt(s.length()-1) + reverseString(s.substring(0,s.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        if(s.equals(reverseString(s))) System.out.println("Yes");
        else System.out.println("No");
    }
}

