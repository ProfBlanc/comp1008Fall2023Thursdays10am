package wk3;

/**
 * A class that determines that coat to wear
 * @author Ben
 * @since 2023-09-21
 * @version 1.0
 */
public class CoatSeason {

    /*
            values / states

            actions / methods

            encapsulation: hide info
                1) integrity
                    restrict values
                2) private info


     */
    private String month, season, coat;
    private double temperature;


    //getters and setter: methods to pass values to instance variables

    //alt+insert
    //right-click => generate


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        if(month.length() < 3)
            System.out.println("Invalid month: " + month);
        else {

            month = month.toLowerCase().substring(0,3);

            this.month = switch (month){
                case "jan","feb","mar","apr","may","jun","jul","aug",
                        "sep","oct","nov","dec": yield month;

                default: yield "jan";
            };
        }
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {

        this.season = switch (season.toLowerCase()){
            case "winter","fall","spring","summer": yield season.toLowerCase();
            default: yield "winter";
        };
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
            this.temperature = temperature >= -50 && temperature <= 50 ? temperature : 0;

            //boolean expression ? statement if true : statement if false
    }

    /*
        constructor: a special method
            no return data type
            called implicitly once when creating the object
     */
    public CoatSeason(){}
    public CoatSeason(String month, double temperature, String season){
        setTemperature(temperature);
        setSeason(season);
        setMonth(month);
    }
    public CoatSeason(double temperature, String month, String season) {
        this(month, temperature, season);
    }
    public CoatSeason(String season, String month, double temperature){
        this(month, temperature, season);
    }
    /*
        all methods that share the same day
            method overloading
                creating a new variation for the method

        method overloading happens when
            method names are same
                unique combination of
                    amount of parameters
                    unique order of data types
     */

}
