import java.util.Scanner;

public class ex17methodsfunctions {

    // creating a method called print java
    public static void printjava() {
        System.out.println("hello java");
    }

    // creating a function printname
    public static void printname(String name) {
        System.out.println(name);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        // calling the method print java
        printjava();
        printjava();
        printjava();

        // calling the function
        printname("chinmay");
        printname("inchal");

        printSum(9, 2);
    }

}
