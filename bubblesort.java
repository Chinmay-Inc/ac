
public class bubblesort {

    //method to print the array
    public static void printArrau(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main (String[]args){
        int arr[]={5,8,6,9,1,2,3};

        for (int i =0; i<arr.length-1;i++){
            for (int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    printArrau(arr);
    }
}