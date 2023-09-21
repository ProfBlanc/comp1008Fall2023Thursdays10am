package wk3;

public class Week3 {

    public static void main(String[] args) {
        example2();
    }
    static void example2(){
        CoatSeason coatSeason = new CoatSeason("sep", 17, "summer");
        System.out.println(coatSeason.getTemperature());
        System.out.println(coatSeason.getMonth());
        System.out.println(coatSeason.getSeason());

    }
    static void example1(){
        CoatSeason coatSeason = new CoatSeason();
        coatSeason.setMonth("abc");
        System.out.println(coatSeason.getMonth());

        coatSeason.setSeason("blah");
        System.out.println(coatSeason.getSeason());

        coatSeason.setTemperature(1000000);
        System.out.println(coatSeason.getTemperature());

    }
}
