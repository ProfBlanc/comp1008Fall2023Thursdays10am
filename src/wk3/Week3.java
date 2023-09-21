package wk3;

import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {
        example5();
    }
    static void example5(){

        //working with arrays
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = new int[5];  //each index default value of 0
        String[] names = new String[5]; //each index default value of null
        Object[] values = {null, 1, 1.1, true, 1d};
        CoatSeason[] items = {new CoatSeason(),
                new CoatSeason("summer", "sep", 17),
                new CoatSeason("fall", "sep", 5)
    };

        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items[2]);

        /*
                monday          tue     wed

                php             c#      coop
                python          java    js


                data tabular: rows and columns
                multi-dimensional array
         */
            String[][] courses1 = new String[3][2];
            courses1[0][0] = "php";
            courses1[0][1] = "python";
            courses1[1][0] = "C#";
            courses1[1][1] = "java";
            courses1[2][0] = "coop";
            courses1[2][1] = "js";

            String[][] courses2 = {
                    {"php","python"},
                    {"c#", "java"},
                    {"coop","js"}
            };

            for(int i=0; i< courses1.length; i++){

                for(int j=0; j < courses1[i].length; j++){
                    System.out.println(courses1[i][j]);
                }
            }

    }
    static void example4(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter season");
        String season = input.nextLine();
        System.out.println("Enter month");
        String month = input.nextLine();
        System.out.println("Enter temperature");
        double temp = input.nextDouble();
        CoatSeason coatSeason = new CoatSeason(season,month, temp);
        System.out.println(coatSeason);

    }
    static void example3(){
        CoatSeason coatSeason = new CoatSeason();
        System.out.println(coatSeason);
    }
    static void example2(){
        CoatSeason coatSeason = new CoatSeason("sep", 17, "summer");
        System.out.println(coatSeason.getTemperature());
        System.out.println(coatSeason.getMonth());
        System.out.println(coatSeason.getSeason());

        System.out.println(coatSeason);

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
