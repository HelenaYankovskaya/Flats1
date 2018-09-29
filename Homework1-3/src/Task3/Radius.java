package Task3;

public class Radius {

    static  int a = 20, b = 16, r = 17;

    public static void main(String[] args) {
        if (a > b) {
            if (r > a) {
                System.out.println("Можно закрыть");
            } else {
                System.out.println("Нельзя закрыть");
            }
        } else {
            if (b > a) {
                if (r > b) {
                    System.out.println("Можно закрыть");
                } else {
                    System.out.println("Нельзя закрыть");
                }
            }

        }
    }}
