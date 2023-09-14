package wk2;

import java.util.Scanner;

public class Week2 {

    //psvm+tab

    public static void main(String[] args) {
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
