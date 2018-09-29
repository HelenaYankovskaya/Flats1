package Avto;

public class Car {
    public int speed;
    public String color;

    public Car(int speed, String color) {

            this.color = color;
            this.speed = speed;
        }

        public void ShowColor ()
        {
            System.out.println("Цвет машины:" + this.color);
        }

    }


