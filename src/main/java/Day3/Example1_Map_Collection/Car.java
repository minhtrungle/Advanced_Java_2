package Day3.Example1_Map_Collection;

public class Car {
    private int id;
    private String color;
    private String name;

    public Car() {
    }

    public Car(int id, String color, String name) {
        this.id = id;
        this.color = color;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car[" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ']';
    }
}
