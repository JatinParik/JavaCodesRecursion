import java.util.Scanner;

public class KMultiplesOfSumUsingRecursion {

    static void printSum(int n, int k) {
        if(k==1) {
        System.out.print(n + " ");
        return;
        }
        printSum(n, k-1);
        System.out.print(n*k + " ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        int n = sc.nextInt();
        System.out.print("Enter a number k : ");
        int k = sc.nextInt();
        printSum(n, k);
    }
}
