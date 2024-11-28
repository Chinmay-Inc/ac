import java.util.Scanner;

public class ex8input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age");
        int age = s.nextInt();
        System.out.println("age:" + age);
        // to take string as a input
        Scanner n = new Scanner(System.in);
        System.out.println("enter your name");
        // n.next will just print a word
        String name = n.next();
        System.out.println(name);
        // if you want to take a whole line as input use n.nextline
        String line = n.nextLine();
        System.out.println("enter the line");
        System.out.println(line);
    }
}
