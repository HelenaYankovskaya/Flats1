package Flats1;

public class AllFlats implements Balcon {

    private int flatArea;
    private  int numberOfRoom;


    @Override
    public boolean isBalcon() {
        return true;
    }

    class OneRoomFlat  {
        public int getNumberOfRoom()
        {
            return numberOfRoom;
        }

        public int getFlatArea()
        {
            return flatArea;
        }
    }
    class TwoRoomFlat {
        public int getNumberOfRoom()
        {
            return numberOfRoom;
        }
        public int getFlatArea()
        {
            return flatArea;
        }
    }

    public void getFlatArea (int flatArea)
    {this.flatArea=flatArea; }


    public void getNumberOfRoom (int numberOfRoom )
    {this.numberOfRoom=numberOfRoom; }


    }

