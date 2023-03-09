package Day1;

public class Main {
    public static void main(String[] args) {
        // Box 1 luu String
        Box<String> box1 = new Box<>();
        box1.put("Hello");
        System.out.println(box1.get());

        Box<Integer> box2 = new Box<>();
        box2.put(3);
        System.out.println(box2.get());

        Box<Box> box3 = new Box<>();
        box3.put(box1);
        System.out.println(box3.get().get());
    }
}
