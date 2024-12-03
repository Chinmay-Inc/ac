public class bcarray {
    public static void main (String []args){
        String [] cars={ "tata","bmw","audi","jaguar","mercedes","truck"};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        try{
            System.out.println(cars[99]);
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("there was an exception : ");
        }finally{
            System.out.println("ahh");
        }

        System.out.println("The code us executed successfully !!!");
    }
}
