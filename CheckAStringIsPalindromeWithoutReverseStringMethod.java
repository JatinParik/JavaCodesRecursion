import java.util.Scanner;

public class CheckAStringIsPalindromeWithoutReverseStringMethod {

    static boolean isPalindrome(String s, int i) {
        if(i>(s.length())/2) return true;
        if(s.charAt(i)==s.charAt(s.length()-1-i)) return isPalindrome(s, i+1);
        return false;
    }

    static boolean isPalindrome2(String s, int i, int j) {
        if(i>=j) return true;
        return (s.charAt(i)==s.charAt(j)) && (isPalindrome2(s, i+1, j-1));
    }
  
    static boolean isPalindrome3(String s) {
        if(s.length()==0 || s.length()==1) return true;
        if(s.charAt(0)==s.charAt(s.length()-1)) return isPalindrome3(s.substring(1, s.length()-1));
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        if(isPalindrome(s, 0)) System.out.printf("Yes %s is Palindrome\n", s);
        else System.out.printf("No %s is not Palindrome\n", s);
        if(isPalindrome2(s, 0, s.length()-1)) System.out.printf("Yes %s is Palindrome\n", s);
        else System.out.printf("No %s is not Palindrome\n", s);
        if(isPalindrome3(s)) System.out.printf("Yes %s is Palindrome\n", s);
        else System.out.printf("No %s is not Palindrome\n", s);
    }
}

