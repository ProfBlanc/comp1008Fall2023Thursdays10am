package wk4;

public class CoatSeason {

    //String season;

    //dropdown menu of options

    //enum: enumerable: preset selection of values
    //array of constants

    //two steps to create enum
    //1: create the list of possible values
    //2: create an instance variable that will store ONE of preset values

    public enum ListOfSeasons {WINTER, SPRING, SUMMER, FALL}
    public ListOfSeasons season = ListOfSeasons.WINTER;

    public enum Months {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}
    public Months month = Months.JAN;

    public String getMonth(){
       return month.toString();
    }
    public void setMonth(Months month){
        this.month = month;
    }

    public void setMonth(String month){

        int index = -1;
        boolean exist = false;


        for(Months currentMonth : Months.values()){
            index++;
            if(currentMonth.toString().equals(month.toUpperCase())){
                exist = true;
                break;
            }
        }

        this.month = exist ? Months.values()[index] : Months.JAN;
    }

}
