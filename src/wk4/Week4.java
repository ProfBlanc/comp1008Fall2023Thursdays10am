package wk4;

public class Week4 {


    public static void main(String[] args) {

        example4();
    }

    static void example4(){

        /*
                a STRING is a hybrid data type
                -Reference
                -Primitive
         */

        //StringBuilder
        //true reference data type
        StringBuilder sb1 = new StringBuilder();
        sb1.append(12345);

        String s1 = "hi";
        s1 = "bye";

        String s2 = new String();
        String s2_1 = new String("hello");
        String s2_2 = new String(new char[]{'b', 'e', 'n'});

        //length, capacity: soft-limit
        //if go over: increases by 1, then doubles
        //capacity = 10 => 22

        StringBuilder sb2 = new StringBuilder();  //capacity 16
        StringBuilder sb3 = new StringBuilder("Hello"); //capacity = length + 16 => 21
        StringBuilder sb4 = new StringBuilder(20);

        sb3.deleteCharAt(1); // Hllo
        sb3.insert(1, "e"); //Hello
        sb3.delete(0,3); //lo
        System.out.println(sb3.toString());


    }

    static void example3(){
        Cat tiger = Cat.createTiger();
        System.out.println(tiger);

        Cat lion = Cat.createLion();
        System.out.println(lion);
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
