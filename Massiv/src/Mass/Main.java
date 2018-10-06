package Mass;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];                                    //формируем массив
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println(" ");

        int a = 0;                                                          //находим максимальное число в массиве
        for (int i = 0; i < array.length; i++) {
            if (a < array[i]) {
                a = array[i];
            }
        }
        System.out.println("Максимальное число в массиве = " + a);
        System.out.println(" ");



        int[] array1 = new int[10]; //формируем массив для сортировки четных чисел

        for (int i = 0; i < array1.length; i++) {
           array1[i]= random.nextInt(10);
            System.out.print(array1[i] + "  ");
        }
        System.out.println(" ");

        for (int i = 0; i < array1.length; i++)                //sort
        {
            if (array1[i] % 2 == 0) {
                int minIndex = i;
                for (int j = i + 1; j < array1.length; j++) {
                    if (array1[j] < array1[minIndex] && array1[j] % 2 == 0) {
                        minIndex = j;
                    }
                }

                int temp = array1[i];
                array1[i] = array1[minIndex];
                array1[minIndex] = temp;

            }
        }
            System.out.println("Четные числа в массиве отсортированы:");
            for (int i1 = 0; i1 < array1.length; i1++)
                System.out.print(array1[i1] + "  ");



    }
}


