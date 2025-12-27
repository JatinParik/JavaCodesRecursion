import java.util.Scanner;

public class PrintingArrayUsingRecursion {
    
    static void printArray(int[] arr, int n) {
        if(n==0) {
            System.out.print(arr[n] + " ");
            return;
        }
        printArray(arr, n-1);
        System.out.print(arr[n] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the Array : ");
        for(int i = 0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        } System.out.println("Printed Array : ");
        printArray(arr, arr.length-1);
    }
}
