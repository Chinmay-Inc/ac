import java.util.Scanner;
import java.util.Random;

public class clustering {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Guess the number from 1 - 10 : ");
        int guess=s.nextInt();

        int rand=r.nextInt(0,10);

        for (int i=0;i<=5;i++) {
            if (guess == rand) {
                System.out.println("You're Right");
            } else {
                System.out.println("Nope !!!");
            }
        }

    }
}
