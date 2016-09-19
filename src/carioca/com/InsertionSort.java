package carioca.com;

/**
 * Created by Konstantin on 18.09.2016.
 */
public class InsertionSort {
    public static void Sort(int[] array) {
        int bfr;
        for (int i = 1; i < array.length; i++) {
            bfr = array[i];
            for(int j = i; j >0; j--){
                if(array[j] < array[j-1]){
                    bfr = array[j-1];
                    array[j-1] = array[j];
                    array[j] = bfr;
                }
                else break;
            }
        }

    }
}
