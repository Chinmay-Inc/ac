import java.util.Scanner;
public class symbols {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows=s.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns=s.nextInt();
        System.out.println("Enter the symbol : ");
        String symbol=s.next();

        for (int i =1;i<=rows;i++){
            System.out.println();
            for(int j =1;j<columns;j++){
                System.out.print(symbol);
            }
        }
    }
}
