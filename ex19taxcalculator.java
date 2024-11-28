import java.util.Scanner;
public class ex19taxcalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your income : ");
        int income=s.nextInt();

        if (income < 50000){
            System.out.println("tax = 0");
        } else if (income>50000 && income <1000000) {
            int tax = (int )(income * 0.2);
            System.out.println(tax);
        }
    }
}
