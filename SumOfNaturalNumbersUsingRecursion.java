import java.util.Scanner;

public class SumOfNaturalNumbersUsingRecursion {
    
     static int Sum(int n) {
      if(n==1) return 1; //n : natural number
      return n + Sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt();
        System.out.print("The sum of n natural numbers : " + Sum(n));
    }
}
