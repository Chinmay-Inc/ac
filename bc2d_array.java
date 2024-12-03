public class bc2d_array {
    public static void main(String[]args){
        String [][] cars= new String[3][3];
        cars[0][0]="BMW";
        cars[0][1]="AUDI";
        cars[0][2]="MERCEDES";
        cars[1][0]="BENTELY";
        cars[1][1]="LAMBO";
        cars[1][2]="PORSHE";
        cars[2][0]="RANGER";
        cars[2][1]="OMNI";
        cars[2][2]="MARUTI";

        for(int i=0;i<cars.length;i++){
            System.out.println();
            for (int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}
