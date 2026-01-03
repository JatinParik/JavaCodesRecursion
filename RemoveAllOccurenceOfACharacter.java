import java.util.Scanner;
 
public class RemoveAllOccurenceOfACharacter {
    
    static String removeOccurence(String s, char ch, int idx) {
        if(idx==s.length()) return "";
        if(ch != s.charAt(idx)) return s.charAt(idx) + removeOccurence(s, ch, idx+1);
        return removeOccurence(s, ch, idx+1);
    }

    static String removeOccurence2(String s, char ch) {
        if(s.equals("")) return "";
        if(s.charAt(0)!=ch) return s.charAt(0) + removeOccurence2(s.substring(1), ch);
        return removeOccurence2(s.substring(1), ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        System.out.print("Enter Character to be removed : ");
        char ch = sc.next().charAt(0);
        System.out.println("String after removing given character : " + removeOccurence(s, ch, 0));
        System.out.println("String after removing given character : " + removeOccurence2(s, ch));
    }
}
