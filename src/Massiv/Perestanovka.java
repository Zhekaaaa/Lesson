package Massiv;
import java.util.Random;

public class Perestanovka {

        public static void main(String[] args) {
            Random random = new Random();
            int array[] = new int[20];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10);
            }
            sortMassive(array);
            if(array[1]==1){  //Я написал,что равно 1 для проверки кода(а так я бы написал >3)
                sredneeZnachenie(array);
            }
            for (int i : array) {
                System.out.println(i);
            }

        }
        public static int[] sortMassive ( int array[]){
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        sorted = false;
                    }
                }

            }
            return array;
        }
        public static int sredneeZnachenie(int arrs[]){
            int summa=0;
            for (int i=0;i<arrs.length;i++){
                summa+=arrs[i];
            }
            summa=summa/arrs.length;
            arrs[0]=summa;
            return arrs[0];
        }
    }

