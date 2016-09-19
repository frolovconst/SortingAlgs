package carioca.com;

/**
 * Created by Konstantin on 18.09.2016.
 */
public class BubbleSort {
    public static void Sort(int[] array){
        int bfr;
        for (int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[j]<array[j-1]){
                    bfr = array[j-1];
                    array[j-1] = array[j];
                    array[j] = bfr;
                }
            }
        }
    }

}
