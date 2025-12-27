import java.util.Scanner;

public class CountOfDigitsUsingRecursion {

    static int countOfDigits(int x) {
        if(x%10==x) {
            return 1;
        }
       return 1 + countOfDigits(x/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int x = sc.nextInt();
        System.out.println("The Sum of digits of the given integer is : " + countOfDigits(x));
    }
}



