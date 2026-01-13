import java.util.Scanner;

public class PrintAllPossibleKeypadCombinations {
     
    static void printComb(String in, String[] kp, String cS) {     //kp -> Keypad , cS -> Current String
        if(in.length()==0) {
              System.out.print(cS + ", ");
              return;
        }
        String s = kp[in.charAt(0) - '0'];
        for(int i = 0; i<s.length(); i++) {
            printComb(in.substring(1), kp, cS + s.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String containing digits from 2 to 9 : ");
        String in = sc.next();   //Input String
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printComb(in, kp, "");
    }
}
