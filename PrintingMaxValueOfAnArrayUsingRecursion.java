import java.util.Scanner;

public class PrintingMaxValueOfAnArrayUsingRecursion {

    static int maxOfArray(int[] arr, int idx) {
        if(idx==0) {
            return arr[0];
        }
        if(maxOfArray(arr, idx-1)>arr[idx]) {
            return maxOfArray(arr, idx-1);
        } return arr[idx];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int idx = sc.nextInt();
        int[] arr = new int[idx];
        if(idx==0) {
            System.out.print("Enter a valid size of the Array");
            return;
        }
        System.out.println("Enter elements of the Array : ");
        for(int i = 0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        } System.out.println("Max value of the given Array : " + maxOfArray(arr, idx-1));
    }
}
