public class ex5casting {
    public static void main(String[] args)
    // casting is the process of converting one data type to another
    // there are two types implicit and explicit data types

    {
        // this is an implicit casting
        double price = 100;
        double fprize = price + 18.5;
        System.out.println(fprize);

        // explicit casting
        int p = 100;
        // here we lose the data.55 when we convert the double into int
        int fp = p + (int) 18.99;
        System.out.println(fp);

    }

}
