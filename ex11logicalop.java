public class ex11logicalop {
    public static void main(String[] args) {

        // && (and) if both the conditions are true then the output is true
        int a = 30;
        int b = 60;

        if (a < 50 && b < 50)
            System.out.println("both smaller than 50");
        else
            System.out.println("one is bigger than 50");

        // || (or) if anyone of the conditions is true the output is true
        if (a < 50 || b < 50)
            System.out.println("any one is smaller than 50 ");

        boolean isAdult = true;
        // if (!) will put true as false and vice versa

        if (!isAdult)
            System.out.println("Adult");
        else
            System.out.println("not an adult");

    }

}
