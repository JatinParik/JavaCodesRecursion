import java.util.Scanner;

public class IsSortedMethodImplimentationUsingRecursion {
    
    static boolean isSorted(int[] arr, int idx) {
        if(idx==arr.length-1) return true; //Base Case
        if(arr[idx]<=arr[idx+1]) return isSorted(arr, idx+1); //Self Work
        return false; //Recursive Work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if(n==0) {
            System.out.println("Enter a valid size of Array");
            return;
        }
        System.out.println("Enter elements of the Array : ");
        for(int i = 0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        } 
        if(isSorted(arr,0)) System.out.println("Yes");
        else System.out.println("No");
    }
}
