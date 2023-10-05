package wk5;

public class Week5 {

    static void example1(){
        /*
                REGEX
                Regular Expressions
                    advanced searching to determine if text MATCH a specified PATTERN

                Special Symbols

                Position

                ^   at start of text
                $   at end of text

                Grouping
                ()  contains
                |   either or
                []  contains any CHARACTER in list
                [start-end] contains character range
                [^]: all character EXCEPT chars within brackets

                Single Char Matches
                .   any single character

                Repetitive Characters
                *   zero or many occurrences
                +   one or many occurrences
                ?   zero or one occurrences aka optional

                Repetition Text
                {N}     exactly N times
                {N,}    at least N times
                {N,M}   between N and M times

                Shortcuts
                \d          [0-9]
                \D          [^0-9]
                \w          [a-zA-Z0-9_]
                \W          [^a-zA-Z0-9_]
                \s          [\r\n\t\v ]
                \S          [^\r\n\t\v ]



         */

        String postalCode = "L4M 3X9";
        boolean valid = true;
        for(int i = 0; i < postalCode.length(); i++){

            if(
            (        i == 0 || i == 2 || i == 5 )
                    &&
            (postalCode.charAt(i) >= 65 && postalCode.charAt(i) <= 90)
            ){}
            else if (
                    ( i == 1 || i == 4 || i == 6)
                    &&
                (postalCode.charAt(i) >= 48 && postalCode.charAt(i) <=57  )
            )
            {}
            else if(i == 3 && postalCode.charAt(i) == 32){}
            else{
                System.out.println("Postal code is invalid");
                valid = false;
                break;
            }

        }

    }
    public static void main(String[] args) {
        example1();
    }
}
