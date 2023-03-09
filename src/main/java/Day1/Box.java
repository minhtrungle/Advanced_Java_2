package Day1;

public class Box <T> {
    private T t;

    public void put(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}
