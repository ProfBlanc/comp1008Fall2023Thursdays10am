package wk4;

public class Week4 {


    public static void main(String[] args) {

        example2();
    }

    static void example2(){

        CoatSeason coatSeason = new CoatSeason();
        System.out.println(coatSeason.season);
        coatSeason.season = CoatSeason.ListOfSeasons.FALL;
        System.out.println(coatSeason.season);
        coatSeason.season = CoatSeason.ListOfSeasons.values()[2];
        System.out.println(coatSeason.season);

        //foreach loop: enhanced for loop
        //for(dataType placeHolder : collectionOfValues
        System.out.println();
        for(CoatSeason.ListOfSeasons currentSeason : CoatSeason.ListOfSeasons.values()){
            System.out.println(currentSeason);
        }

    }

    static void example1(){
        System.out.println(Apple.creator);
        Apple.creator = "Cool Person";
        System.out.println(Apple.creator);

        Apple ipad = new Apple();
        System.out.println(Apple.YEAR_CREATED);

        System.out.println(Apple.emailSupport("canada"));

    }
}
