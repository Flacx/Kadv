public class Subject {

    private String name;
    private int id;
    private float hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public Subject(String name, int id, float hp) {
        this.name = name;
        this.id = id;
        this.hp = hp;

    }
}
