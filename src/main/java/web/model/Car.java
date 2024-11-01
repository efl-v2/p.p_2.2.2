package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model;

    private int year;

    private String color;


    public Car() {}

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return year;
    }

    public void setSeries(int series) {
        this.year = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}