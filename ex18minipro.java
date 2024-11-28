import java.util.Scanner;

public class ex18minipro {

    public static void main(String[] args) {
        int mynumber = (int) (Math.random() * 100);
        int usernumber = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter your number  :  ");
            usernumber = sc.nextInt();
            if (usernumber == mynumber) {
                System.out.println("WooW Hoo Correct Number");
                break;
            } else if (usernumber > mynumber) {
                System.out.println("your number is big");

            } else {
                System.out.println("Your number is small");
            }

        } while (usernumber >= 0);
        System.out.println("my number was");
        System.out.println(mynumber);

    }

}
