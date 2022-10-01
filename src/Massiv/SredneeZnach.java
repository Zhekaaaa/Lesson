package Massiv;

public class SredneeZnach {
        public static void main(String[] args) {

            double array[] = {15, 2, 21, 4, 15, 6, 18, 19, 9, 20, 11, 21, 24, 23, 22, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            double res = sum / array.length;

            System.out.println("Средняя температура за месяц составляет: " + res + " " + "градусов");
        }
    }


