import java.util.Random;

public class Sortirovka {

    public static void main(String[] args) {
        int[] array = new int[6];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

       /* int a = array[0];
        for (int i = 0; i < array.length; i++) {
            if (a < array[i])
                a = array[i];
        }
        System.out.println("Maximum = " + a);*/

       /* System.out.println(" ");                                   простая сортировка

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/

        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {

                    if ((array[i] % 2) == 0)
                    {
                        int minIndex = i;
                        for (int j = i + 1; j < array.length-1; j++) {
                            if ((array[j] % 2) == 0) {
                                if (array[j] <= array[minIndex]) {
                                    minIndex = j;
                                }
                            }else j++;}
                         int temp = array[i];
                         array[i] = array[minIndex];
                         array[minIndex] = temp;}

                      }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");}
    }}






