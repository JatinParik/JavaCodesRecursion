import java.util.Scanner;

public class FrogJumpProblem {
    //hi[i] of height of ith stone
    //A frog can jump on i+1 or i+2....cost to jump on j from i is absolute of hi[j]-h[i]

    static int minCost(int[] hi, int i) {
        if(i==hi.length-1) return 0; //Base Case
        int ans1 = Math.abs(hi[i+1]-hi[i]) + minCost(hi, i+1); //Recurrence Relation
        if(i==hi.length-2) return ans1; //Base Case
        int ans2 = Math.abs(hi[i+2]-hi[i]) + minCost(hi, i+2); //Recurrence Relation
        return Math.min(ans1, ans2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stones : ");
        int n = sc.nextInt();
        int[] hi = new int[n];
        System.out.println("Enter height of stones : ");
        for(int i = 0; i<hi.length; i++) {
             hi[i] = sc.nextInt();
        }
        System.out.println("Minimum cost to reach the last stone : " + minCost(hi, 0));
    }
}
