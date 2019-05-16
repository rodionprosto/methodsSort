import java.util.Arrays;

public class sort {

    public static void main(String[] args) {
        int []unsortarray={5,9,3,6,7,8,1,0,2,4};
        //sortselect(unsortarray);
        sortbuble(unsortarray);
    }
    static void sortselect(int [] array){
        for(int i=0;i<array.length-1;i++){
            int minindex=i;
            for (int j=i;j<array.length;j++){
                if (array[minindex]>array[j]){
                    minindex=j;
                }
            }
            int t=array[minindex];
            array[minindex]=array[i];
            array[i]=t;
            System.out.println(array[i]);
        }

    }
    static void sortinsert (int[]array){
        int indexinsert;
        int element;
        for (int i=0;i<array.length;i++){
        element=array[i];
            indexinsert=i;
            while(indexinsert>0 && array[indexinsert-1]>element){
                array[indexinsert]=array[indexinsert-1];
                indexinsert--;
                array[indexinsert]=element;
        }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void sortbuble(int[] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }

}
