import java.util.Scanner;
import java.util.ArrayList;

public class IndicesOfTargetValueAsArrayList { 
   
    //First Approach
    static ArrayList<Integer> findIndices(int[] arr, int idx, int x, ArrayList<Integer> l) {
        if(idx==arr.length) return l; //Base Case
        if(arr[idx]==x)  l.add(idx);  //Self Work
        findIndices(arr, idx+1, x, l); //Recursive Work
        return l;
    }

    //Second Approach
    static ArrayList<Integer> findIndices2(int[] arr, int idx, int x) {
        ArrayList<Integer> l = new ArrayList<>();
        if(idx == arr.length) return l;  //Base Case
        if(arr[idx] == x) l.add(idx);
        ArrayList<Integer> smallAns = findIndices2(arr, idx+1, x);
        l.addAll(smallAns);
        return l;
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
        ArrayList<Integer> l = new ArrayList<>();
        findIndices(arr, 0, x, l);
        System.out.println(l);
        System.out.println(findIndices2(arr, 0, x));
    }
}



