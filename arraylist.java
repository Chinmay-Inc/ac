import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("dougnhnut");
        food.add("cake");


        //to print the elements of the array list use a for loop
        // and use the .size instead of .length
        for (int i =0; i<food.size();i++){
            System.out.println(food.get(i));
        }

        System.out.println(" ");

        //use the set method to set or update the value for a index
        food.set(0,"Sushi");

        food.remove(1);
        for (int i =0; i<food.size();i++){
            System.out.println(food.get(i));
        }



    }
}
