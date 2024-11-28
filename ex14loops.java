public class ex14loops {
    public static void main(String[] args) {

        // for loop
        for (int i = 0; i <= 100; i = i + 5) {
            System.out.println(i);
        }
        int j = 100;

        // while loop
        while (j >= 1) {
            System.out.println(j);
            j = j - 1;

        }

        // do while loop
        int k = 100;
        do {
            System.out.println(k);
            k = k - 1;

        } while (k >= 1);
    }

}
