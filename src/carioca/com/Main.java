package carioca.com;
import java.util.Random;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        final int N = 10;
        int[] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = (int) (Math.random()*100);
        }
        System.out.println("Before");
        for(int i = 0; i < N; i++){
            System.out.println(i+1 + ".\t" + array[i]);
        }
        QuockS.Sort(array);
        System.out.println("After");
        for(int i = 0; i < N; i++){
            System.out.println(i+1 + ".\t" + array[i]);
        }
        for(int i=1; i < N; i++){
            if(array[i] < array[i-1])
                System.out.println("error");
        }

    }
}
