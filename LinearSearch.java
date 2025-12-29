import java.util.Scanner;

public class LinearSearch {
    
    static boolean checkValue(int[] arr, int idx, int x) {
        if(idx==arr.length) return false; //Base Case
        if(arr[idx]==x) return true; //Self Work
        return checkValue(arr, idx+1, x); //Recursive Work
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
        if(checkValue(arr, 0, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
