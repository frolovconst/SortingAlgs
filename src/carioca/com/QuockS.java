package carioca.com;

/**
 * Created by Konstantin on 19.09.2016.
 */
public class QuockS {
    public static void Sort(int[] arry){
        QuickSort(arry, 0, arry.length-1);
    }

    private static void QuickSort(int[] arry, int left, int right){
        if(left>=right)
            return;
        int mdl = Partition(arry, left, right);
        QuickSort(arry, left, mdl-1);
        QuickSort(arry, mdl+1, right);

    }

    private static int Partition(int[] arry, int extLeft, int extRight) {
        int left = extLeft;
        int right = extRight+1;
        int pivot = arry[extLeft];
        while(true){
            while(arry[++left] < pivot && left < extRight);
            while (arry[--right] > pivot && right > extLeft);
            if(left < right)
                swapBfr(arry, left, right);
            else
                break;
        }
        swapBfr(arry,extLeft,right);
        System.out.println(right + " " + left);
        return right;
    }

    static void swap(int[] arry, int i, int j){
        arry[i] = arry[i]+arry[j];
        arry[j] = arry[i]-arry[j];
        arry[i] = arry[i]-arry[j];
    }

    static void swapBfr(int[] arry, int i, int j) {
        int bfr;
        bfr = arry[i];
        arry[i] = arry[j];
        arry[j] = bfr;
    }

}
