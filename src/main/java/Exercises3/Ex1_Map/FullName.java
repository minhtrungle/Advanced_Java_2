package Exercises3.Ex1_Map;

public class FullName {
    private String fistName;
    private String lastName;

    public FullName() {
    }

    public FullName(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName[" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ']';
    }
}
