import java.util.Scanner;

public class PrintSubsequencesWithoutStoring {
    
    static void printSSQ(String s, String currAns) {     //Initially currAns = ""
        if(s.length()==0) {              //Base Case
            System.out.print(currAns + " ");
            return;
        }
        char cc = s.charAt(0);
        printSSQ(s.substring(1), currAns + cc);  //Print with cc
        printSSQ(s.substring(1), currAns);   //Print without cc
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        printSSQ(s, "");
    }
}
