package Super;
import Avto.Car;
public class Hello {











    public static void main(String[] args)
    {
        Car Car = new Car(80,"red");
        Car.ShowColor();


        if (Car.speed > 50)
            System.out.println("Скорость высокая");
        else
            System.out.println("Скорость низкая");
        if (Car.color == "red")
            System.out.println("Цвет машины красный");
        else
            System.out.println("Цвет машины не красный");

        System.out.println("Hello World");
        int a = 1;
        int b = 3;
        int c = 7;

        System.out.println(a++);
        System.out.println(++c);

    }
}

