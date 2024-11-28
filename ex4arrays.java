import java.util.Arrays;

public class ex4arrays {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[2]);
        System.out.println(marks.length);
        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        // there is no need to initialize the array with new keyword if you know the
        // values
        // you can enter multiple values inside a single array using {} and,
        int[] allmarks = { 99, 98, 97 };
        System.out.println(allmarks[1]);
        // 2d array
        // you can add the marks of two students in a single array using [][] and to
        // enter the value {{marks 1},{marks2}}
        int[][] twostudentmarks = { { 98, 97, 99 }, { 93, 94, 96 } };
        System.out.println(twostudentmarks[1][2]);

    }
}