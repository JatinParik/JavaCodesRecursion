import java.util.Scanner;

public class LastIndexOfTargetValue {
    
    static int lastIndex(int[] arr, int idx, int x) {
        if(idx<0) return -1; //Base Case
        if(arr[idx]==x) return idx; //Self Work
        return lastIndex(arr, idx-1, x); //Sub Problem or Recursive Work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter the elements of the Array : ");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        } 
        System.out.print("Enter target value : ");
        int x = sc.nextInt();
        System.out.println("Target value is present at index : " + lastIndex(arr, n-1, x));
    }
}
