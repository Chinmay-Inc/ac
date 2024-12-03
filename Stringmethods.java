public class Stringmethods {
    public static void main(String []args){
        //string methods
        String name ="Chinmay";

        boolean result= name.equals("Chinmay");
        System.out.println(result);

        boolean result1= name.equalsIgnoreCase("chinmay");
        System.out.println(result1);

        int result2= name.length();
        System.out.println(result2);

        char result3= name.charAt(5);
        System.out.println(result3);

    }
}
