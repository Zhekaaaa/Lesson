package Massiv;
import java.util.Arrays;
import java.util.Random;

public class Trimassiva {

    public static void main(String[] args) {

        Random random = new Random();
        int a[] = new int[10];
        int b[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(9);
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = random.nextInt(10);
        }
        sortMassivee(a);
        sortMassivee(b);
        for (int i : a) {
            System.out.println(i + " " + "Элемент первого массива");
        }
        for (int j : b) {
            System.out.println(j + "  " + "Элемент вротого массива");
        }
       int ass[]= merge(a,b);
        System.out.println(Arrays.toString(ass));



    }


    public static int[] sortMassivee(int arrayy[]) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrayy.length - 1; i++) {
                if (arrayy[i] > arrayy[i + 1]) {
                    temp = arrayy[i];
                    arrayy[i] = arrayy[i + 1];
                    arrayy[i + 1] = temp;
                    sorted = false;
                }
            }

        }
        return arrayy;
    }
    public static int []merge(int ar[],int ba[]){
        int i = 0;
        int j = 0;
        int k = 0;
        int c[] = new int[ar.length + ba.length];
        while (i < ar.length && j < ba.length) {
            if (ar[i] <= ba[j]) {
                c[k] = ar[i];
                i++;
            } else {
                c[k] = ba[j];
                j++;
            }
            k++;
        }
        while (i< ar.length){
            c[k]=ar[i];
            k++;
            i++;
        }
        while (j< ba.length){
            c[k]=ba[j];
            k++;
            j++;
        }

        return c;

    }

}
