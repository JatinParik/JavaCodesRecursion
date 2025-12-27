import java.util.Scanner;

public class AlternateSignSumOfNaturalNumbersUsingRecursion {
    
    static int altSum(int n) {
      if(n==1) return 1; //n : natural number
      if(n%2==0) return -n + altSum(n-1);
      return n + altSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt();
        System.out.print("The sum of alternating series upto term n : " + altSum(n));
    }
}
