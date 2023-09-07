package wk1;

import java.util.Scanner;

public class Week1 {


    //psvm+tab
    public static void main(String[] args) {
        Home home = new Home();

        System.out.println(10d / 3);

        Scanner input = new Scanner(System.in);
        //ask user for name, age

        System.out.println("Enter name");
        String name = input.nextLine(); //nextLine(), next(): reads until whitespace
        System.out.println(name);
        System.out.println("Enter age");
        byte age = input.nextByte();  //'100\n'
        input.nextLine();  //consume \n character
        System.out.println(age);
        System.out.println("Enter address");
        String address = input.nextLine();
        System.out.println(address);

    }


}

//class Two{}
/*
In a .java class. The name of the class MUST match the name of the file

accessibility levels of java?
    default, package-private: no keyword before entity
    protected: default: the same: access within package

property : instance variable


 */