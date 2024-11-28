public class ex16exception {
    // exception make sure the code continus to execute even if there is an error in
    // the code
    public static void main(String[] args) {
        int[] marks = { 5, 6, 7, 8 };
        try {
            System.out.println(marks[2]);
        } catch (Exception exception) {
            System.out.println("how are you");

        }
    }
}