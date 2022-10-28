package web.model;

public class Car {
    private String model;
    private int number;
    private String colors;

    public Car(String model, int number, String colors) {
        this.model = model;
        this.number = number;
        this.colors = colors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
}
