//square pattern
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the pattern");
        String pattern=s.nextLine();
        System.out.println("enter the number of lines");
        int line=s.nextInt();

        for (int lines=1 ; lines<=line ; lines++){
            System.out.println(pattern);
        }
    }
}
