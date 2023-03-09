package Day1.Ex1;

public abstract class MayTinh <T> {
    private T t1;
    private T t2;

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public T getT2() {
        return t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }
    public abstract T tong(T...t);

    public abstract T hieu(T t1, T t2);

    public abstract T tich(T...ts);

    public abstract T thuong(T t1, T t2);
}
