import java.util.Scanner;

public class ex14dowhileprog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int num = 0;
        do {
            System.out.println("enter your number");
            num = sc.nextInt();
            System.out.print("here is your number:  ");
            System.out.println(num);
        } while (num >= 0);
        System.out.println("THE END");*/
        int n=0;
        while (n>0 && n<100){
            System.out.println("n is : "+n);
            n++;
        }

    }

}
