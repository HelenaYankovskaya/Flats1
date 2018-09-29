package Task2;

public class Seven {
    static int a = 555;
    static double s;


    public static void main(String[] args) {
        s = a % 10;
        if (s == 7) {
            {
                System.out.println("Последняя цифра числа равнa 7");
            }
        } else {
            System.out.println("Последняя цифра числа не равна 7!!!!,а равна " + s);
        }
    }
}







