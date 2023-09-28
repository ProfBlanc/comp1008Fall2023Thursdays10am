package wk4;

public class Apple {

    //call Apple support

    //static: keyword: only 1 reference of entity in virtual memory
    //not doing to be a change to the value
    public static String creator = "Steve Jobs";
    public final static short YEAR_CREATED = 1980;

    public static String emailSupport(String country){

        return switch (country){
            case "canada" -> "help@email.ca";
            case "usa" -> "help@email.com";
            default -> "no-reply@email.com";
        };
    }
    public final void myMethod(){
        System.out.println("Hello From Final myMethod");
    }
}
