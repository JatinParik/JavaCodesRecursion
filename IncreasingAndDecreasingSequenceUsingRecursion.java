import java.util.Scanner;

public class IncreasingAndDecreasingSequenceUsingRecursion {

    static void printIncreasing(int n) {
        if(n==1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");
    }

    static void printDecreasing(int n) {
         if(n==1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
    }
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n : ");
       int n = sc.nextInt();
       System.out.print("Icreasing sequence : ");
       printIncreasing(n);
       System.out.println();
       System.out.print("Decreasing sequence : ");
       printDecreasing(n);
    }
}