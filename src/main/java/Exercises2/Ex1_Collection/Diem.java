package Exercises2.Ex1_Collection;

import java.util.Arrays;

public class Diem {
    private String idStudent;
    private String idSubject;
    private int mark;

    public Diem() {
    }

    public Diem(String idStudent, String idSubject, int mark) {
        this.idStudent = idStudent;
        this.idSubject = idSubject;
        this.mark = mark;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Diem[" +
                "idStudent='" + idStudent + '\'' +
                ", idSubject='" + idSubject + '\'' +
                ", mark=" + mark +
                ']';
    }
}
