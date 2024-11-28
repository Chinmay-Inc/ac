public class Calculate {

    void dsum(int a, int b) {
        System.out.println("The sum of integers is: " + (a + b));
    }

    void dsum(float a, float b) {
        System.out.println("The sum of floats is: " + (a + b));
    }

    public static void main(String[] args) {
        Calculate cu = new Calculate();
        cu.dsum(4, 5);
        cu.dsum(2.88f, 5.660f);
    }
}
