import java.util.Scanner;

public class PPowerQUsingRecursion {
    
    static int power(int p, int q) {
      if(q==0) {
        return 1;
      }  
      return p*power(p, q-1);
    }

    static int powerAlternateApproach(int p, int q) {
        if(q==0) return 1;
        int smallPow = powerAlternateApproach(p, q/2);
        if(q%2==0) return smallPow*smallPow;
        return smallPow*smallPow*p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p : ");
        int p = sc.nextInt();
        System.out.print("Enter q : ");
        int q = sc.nextInt();
        System.out.println("Value of p raise to the power q : " + power(p,q));
        System.out.println("Value of p raise to the power q using alternate approach : " + powerAlternateApproach(p,q));
    }
}
