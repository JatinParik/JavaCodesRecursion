import java.util.Scanner;

public class FibonacciSequenceUsingRecursion {
    
    static void fibPrint(int n) {
       if(n==2) {
        System.out.print("0 1 ");
        return;
       }
       fibPrint(n-1);
       int fibN = fib(n);
       System.out.print(fibN + " ");
    }

    static int fib(int n) {
      if(n==1 || n==2) return n-1;
      return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt(); 
        fibPrint(n);
    }
}
