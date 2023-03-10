package Day2.Example_Queue;

public class Message {
    private  int id;
    private String name;

    public Message() {
    }

    public Message(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Message[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ']';
    }
}
