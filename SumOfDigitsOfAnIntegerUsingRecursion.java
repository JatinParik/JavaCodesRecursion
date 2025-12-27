import java.util.Scanner;

public class SumOfDigitsOfAnIntegerUsingRecursion {


    static int sumOfDigits(int x) {
        if(x%10==x) {
            return x;
        }
       return x%10 + sumOfDigits(x/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int x = sc.nextInt();
        System.out.println("The Sum of digits of the given integer is : " + sumOfDigits(x));
    }
}
