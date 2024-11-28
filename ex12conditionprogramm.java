import java.util.Scanner;

public class ex12conditionprogramm {
    public static void main(String[] args) {
        // pen=10 book=30
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount you have");

        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("sorry you cant buy anything");
            System.out.println("get more money");

        } else if (cash > 10 && cash < 30) {
            System.out.println("you can afford pen");
        } else {
            System.out.println("you can buy both");
        }
    }
}
