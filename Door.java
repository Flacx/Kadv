public class Door {
    private Room r1;
    private Room r2;
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Door(Room r1, Room r2, int x1, int y1, int x2, int y2) {
        this.r1 = r1;
        this.r2 = r2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Room[] getRooms() {
        Room[] t = new Room[2];
        t[0] = r1;
        t[1] = r1;
        return t;
    }



}
