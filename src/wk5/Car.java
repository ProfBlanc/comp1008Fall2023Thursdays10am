package wk5;

public class Car {

    private String color = "black";
    private int doors = 4;
    private double weight = 1000;

    public Car(){}
    public Car(String color, int doors, double weight){
        setWeight(weight);
        setColor(color);
        setDoors(doors);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.length() >= 3)
            this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors == 2 || doors == 4 || doors == 5)
            this.doors = doors;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight >= 1000)
            this.weight = weight;
    }
}
