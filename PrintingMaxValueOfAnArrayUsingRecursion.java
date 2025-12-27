import java.util.Scanner;

public class PrintingMaxValueOfAnArrayUsingRecursion {

    static int maxOfArray(int[] arr) {
        int maxValue = arr[0];
        for(int i = 0; i<arr.length; i++) {
               if(maxValue<arr[i]) {
                maxValue = arr[i];
               }
       } return maxValue; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the Array : ");
        for(int i = 0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        } System.out.println("Max value of the given Array : " + maxOfArray(arr));
    }
}
