import java.util.Scanner;
import java.util.Random;

public class pra1 {
    public static void main(String [] args){
        Scanner s= new Scanner (System.in);
        Random r = new Random();

        int n = s.nextInt();
        System.out.println(" The entered number is : "+n);

        int rando=r.nextInt(1,n);
        System.out.println(rando);


    }
}
