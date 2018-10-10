package Flats1;

public class Main {
    public static void main(String[] ags) {
        AllFlats allFlats=new AllFlats();
        allFlats.getFlatArea(56);
        allFlats.getNumberOfRoom(2);
        AllFlats.OneRoomFlat oneRoomFlat= allFlats.new OneRoomFlat();
        AllFlats.TwoRoomFlat twoRoomFlat= allFlats.new TwoRoomFlat();

        System.out.println("Площадь квартиры №1 = " + oneRoomFlat.getFlatArea());
        System.out.println("Количество комнат в квартире №2 = " + twoRoomFlat.getNumberOfRoom());
        System.out.println("Количество комнат в квартире №1 и №2 = " + allFlats.isBalcon());
    }


}
