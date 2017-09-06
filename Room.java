import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {

    private String name;
    private char[][] field;
    private ArrayList<Door> doorlist;
    public Room(String name, int sizex, int sizey) {
        this.name = name;
        field = new char[sizex][sizey];
        doorlist = new ArrayList<Door>();
    }


    public ArrayList<Door> getDoorlist() {
        return doorlist;
    }

    public static void connect(Room r1, Room r2, int x1, int y1, int x2, int y2) {
        Door d = new Door(r1, r2, x1, y1, x2, y2);
        r1.getDoorlist().add(d);
        r2.getDoorlist().add(d);

    }

    public char getContent(int x, int y) {
        try {
            return field[x][y];
        } catch(NullPointerException e) {
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return 'E';
    }

    public void setContent(int x, int y, char c) {
        try {
            field[x][y] = c;
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

}
