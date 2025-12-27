import java.util.Scanner;

public class NthFibonacciNumberUsingRecursion {
    
    static int fib(int n) {
      if(n==1 || n==2) return n-1;
      return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt(); 
        System.out.println(fib(n));
    }
}
