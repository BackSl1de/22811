package web.model;

import org.springframework.stereotype.Component;

@Component

public class Car {
    private String model;
    private int price;
    private String color;
    private  static String head = "Model/" + ' ' + "Price/" + ' ' + "Color";

    public Car(){

    }

    public Car(String model, int price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
    public String getHead(){
        return head;
    }
    public String carOptions() {
        return model + "/ " + price + "/ " + color;
    }

}
