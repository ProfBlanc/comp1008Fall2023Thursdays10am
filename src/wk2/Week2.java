package wk2;

import java.util.Scanner;

public class Week2 {

    //psvm+tab

    static void workingWithLoops(){

        int start = 1;
        int end = 20;

//        for( ; start <= end; start++){
//            System.out.println(start);
//        }

//        for( ; start <= end  ; ){
//            System.out.println(start);
//            start++;
//        }

//        for( ; ;){
//            if(start > end)
//                break;
//            System.out.println(start);
//            start++;

//        while(start <= end){
//            System.out.println(start);
//            start++;
//        }

        do{
            System.out.println(start);
            start++;
        }while(start<=end);


        }



    static void example1(){
              /*
                Season-Month-Temperature-Coat program

                Determine which coat to wear
                depending on
                    season, month, temperature

            1) Ask the user for: season, month and temperature.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a season");
        String season = input.nextLine();
        System.out.println("Enter a month");
        String month = input.nextLine();
        System.out.println("Enter a temperature");
        String temperatureText = input.nextLine();


        if(validateSeason(season)){
            System.out.println("Season " + season + " is valid");
        }
        else{
            //serr
            System.err.println("Season " + season + " is NOT valid");
        }

        /*
            String formatting: script with placeholder
                Console.WriteLine($"Text {}.", "value to insert");

                souf+tab
                    System.out.printf("Text  %DataTypePlaceHolder"  );

                    %s, %d, %f: string digit (whole number) float (percision number)
         */

        if(validateMonth(month)){
            System.out.printf("Month %s is valid%n", month);
        }
        else{
            System.err.printf("Month %s is NOT valid", month);
        }


        //write a method that validates the month
        //call this method in main method => output whether month is valid


        //convert the Temperature
        //Convert.toTargetDataType
        //Convert.toInt32(stringValue)

        int temp1 = Integer.parseInt(temperatureText);
        double temp2 = Double.parseDouble(temperatureText);
        byte temp3 = Byte.parseByte(temperatureText);

        //promote byte to a short
        short temp4 = temp3;
        //promotion
        long temp5 = temp1;
        /*
        double in bits?     long in bits?
            64                  64


         */
        double temp6 = temp5;

        //demotion: going from big to small
        int value1 = 130;
        byte value2 = (byte)value1;
        System.out.println(value2);


        /*
            -128            127

            128         -128
            129         -127
            130         -126

         */

        //make a decision on what Coat to wear

        /*
            if season is summer
                and month is september
                    wear light coat
                else
                    wear no coat

            if season is fall
                september: light coat
                october: thick sweater
                november or december: heavy coat


         */
        String coat = "";
        if(season.equalsIgnoreCase("summer")){
            if(month.equalsIgnoreCase("september") && temp1 < 15){
                coat = "Light Coat";
            }
            else{
                coat = "No Coat";
            }

        }
        if(season.equalsIgnoreCase("fall")){
            coat = switch (month.substring(0,3)){
                case "sep": yield "Light Coat";
                case "oct": yield "Thick Sweater";
                default: yield "heavy coat";
            };
        }

        System.out.printf("In the %s season, during the month of %s, " +
                "with the temperature of %d degrees C, " +
                "you should wear the coat of %s%n", season, month, temp1, coat);
    }

    public static void main(String[] args) {

        //workingWithLoops();

        example1();


    }
        // Winter    winter   WiNtEr


  static boolean validateMonth(String month){
        //switch statements?
      /*
            variableValue = switch(expression){

            case value1: yield returnValue
            case value2, valueN: yield
            }
       */

     // boolean answer =
      return switch (month.toLowerCase().substring(0,3)){
          case "jan", "feb", "mar","apr","may","jun","jul","aug","sep","oct","nov","dec": yield true;
          default: yield false;
      };
      //return answer;

  }
    static boolean validateSeason(String season){
        season = season.toLowerCase().trim();  // "   winter   "  => "winter"

        return season.equalsIgnoreCase("Summer") ||
                season.equalsIgnoreCase("Winter") ||
                season.equals("fall")  ||
                season.equals("spring");
     }

}
