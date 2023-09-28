package wk4;

public class Cat {

    private String name;
    private int numberOfStripes, numberOfSpots;
    private double scariness;

    public Cat(){}
    public Cat(String name,
               int numberOfStripes, int numberOfSpots,
               double scariness) {
        this.name = name;
        this.numberOfStripes = numberOfStripes;
        this.numberOfSpots = numberOfSpots;
        this.scariness = scariness;
    }
    //factory method: method that creates a new instance of class

    public static Cat createTiger(){
        return new Cat("Tiger", 10, 0, 80.0);
    }
    public static Cat createLion(){
        return new Cat("Lion", 0, 0, 85d);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", numberOfStripes=" + numberOfStripes +
                ", numberOfSpots=" + numberOfSpots +
                ", scariness=" + scariness +
                '}';
    }
}
