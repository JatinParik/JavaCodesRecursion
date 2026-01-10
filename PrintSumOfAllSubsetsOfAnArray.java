import java.util.Scanner;

public class PrintSumOfAllSubsetsOfAnArray {
    
    static void subsetSum(int[] arr, int i, int currAns) {   //Initially currAns = 0
         if(i == arr.length) {
            System.out.print(currAns + " ");        //Base Case
            return;
         } 
         int cE = arr[i];    //cE -> current element
         subsetSum(arr, i+1, currAns + cE);    //Include cE in sum
         subsetSum(arr, i+1, currAns);        //Do not include cE in sum       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of Array : ");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        subsetSum(arr, 0, 0);
    }
}
