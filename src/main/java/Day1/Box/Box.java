package Day1.Box;

public class Box <T> {
    private T t;

    public void put(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}
