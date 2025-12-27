import java.util.Scanner;

public class GcdUsingRecursion {
    
    static int gcd(int x, int y) {
      if(y==0) return x;
      if(x==0) return y;
      return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int y = sc.nextInt();
        System.out.println("GCD of both numbers is : " + gcd(x,y));
    }
}
