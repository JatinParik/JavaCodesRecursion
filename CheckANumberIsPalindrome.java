import java.util.Scanner;

public class CheckANumberIsPalindrome {
    
    static int reverseOfNumber(int num, int i) {
        if(num==0) return i;
        return reverseOfNumber(num/10, i*10 + num%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num==reverseOfNumber(num, 0)) System.out.printf("Yes %d is Palindrome\n", num);
        else System.out.printf("No %d is not Palindrome", num);
    }
}
