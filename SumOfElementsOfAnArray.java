import java.util.Scanner;

public class SumOfElementsOfAnArray {

    static int sumArray(int[] arr, int idx) {
        if(idx==arr.length) {
            return 0;
        }
        return arr[idx] + sumArray(arr, idx+1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int idx = sc.nextInt();
        int[] arr = new int[idx];
        System.out.println("Enter the elements of the Array : ");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of Elements of the Array : " + sumArray(arr, 0));
    }
}
