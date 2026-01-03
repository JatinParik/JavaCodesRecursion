import java.util.Scanner;

public class CheckANumberIsPalindrome {
    
    static int reverseOfNumber(int num, int i) {
        if(num==0) return i;
        return reverseOfNumber(num/10, i*10 + num%10);
    }
    static int countOfDigits(int num) {
        if(num==0) return 0;
        return 1 + countOfDigits(num/10);
    }
    static boolean isPalindrome(int num, int d) {
        if(num==0) return true;
        return num%10 == num/d && isPalindrome(num%d/10, d/100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int d = (int)Math.pow(10, countOfDigits(num)-1);
        if(num==reverseOfNumber(num, 0)) System.out.printf("Yes %d is Palindrome\n", num);
        else System.out.printf("No %d is not Palindrome\n", num);
        if(isPalindrome(num, d)) System.out.printf("Yes %d is Palindrome\n", num);
        else System.out.printf("No %d is not Palindrome\n", num);
    }
}
