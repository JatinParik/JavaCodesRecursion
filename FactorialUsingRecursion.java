import java.util.Scanner;

public class FactorialUsingRecursion {
    
    static int fact(int n) {
      if(n==0) {
        return 1;
      }
      return fact(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt();
        System.out.println("Factorial of n : " + fact(n));
    }
}
