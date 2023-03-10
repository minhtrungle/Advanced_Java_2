package Exercises2.Ex1_Collection;

public class MonHoc {
    private String idSubject;
    private String nameSubject;

    public MonHoc() {
    }

    public MonHoc(String idSubject, String nameSubject) {
        this.idSubject = idSubject;
        this.nameSubject = nameSubject;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    @Override
    public String toString() {
        return "MonHoc[" +
                "idSubject='" + idSubject + '\'' +
                ", nameSubject='" + nameSubject + '\'' +
                ']';
    }
}
