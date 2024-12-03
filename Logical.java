import java.util.Scanner;
public class Logical {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);

        System.out.println("enter the number : ");
        int n= s.nextInt();

        if(n!=2 || n!=4 ){
            System.out.println("the number is not 2 or 4");
        }else{
            System.out.println("the number is 2 or 4");
        }
    }
}
