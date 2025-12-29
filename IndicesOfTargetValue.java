import java.util.Scanner;

public class IndicesOfTargetValue {
   
    
    static void findIndices(int[] arr, int idx, int x) {
        if(idx==arr.length) {
            return;
        }
        if(x==arr[idx]) {
            System.out.print(idx + " ");
        }
        findIndices(arr, idx+1, x);
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
        System.out.print("Enter target value : ");
        int x = sc.nextInt();
        System.out.print("Indices are : ");
        findIndices(arr, 0, x);
    }
}


