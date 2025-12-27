import java.util.*;


public class CalculateDifferentTypesOfNumbers {
 
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any no. of numbers you want and when its done , type 10101");
    int positive = -1;
    int negative = 0;
    int zeroes = 0;
    for(int i = 1 ; i>=0 ;i++) {
        int x = sc.nextInt();
        if(x==0) {
            zeroes++;
        } else if(x>0) {
            positive++;
        } else {
            negative++;
        }
        if(x == 10101) {
            break;
        }
    }
    System.out.println("Number of Positive numbers you entered = " + positive);
    System.out.println("Number of Negative numbers you entered = " + negative);
    System.out.println("Number of Zeroes you entered = " + zeroes);

 }
}