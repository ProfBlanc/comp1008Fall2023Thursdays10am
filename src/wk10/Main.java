// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*

polymorphism: many forms

overloading: 
    same name, different implimentation
overridding
    variations


Create objects based on COMPONENTS

Inner Components
    Abstract class: dedicated super class
    cannot be instantied
    inner component of bigger class
    has all features of concrete class
        instance variables, constants, methods, constructors
    Also be defined as incomplete class
    General category/grouping of objects
    Can have an abstract method
        a method with NO default body/bahviour

Outter Componennts
    Interface: list of requirements
    these requirements are PUBLIC
    method signature (requirements), and constant values
    A class can implement many many
    An interface can EXTEND another or many interfaces



Game part 1

Me: State an object
You: state if object should be a concrete class, an abstract class or an interface

Q1) Does this object exists/function by itself.
    YES: concrete class
    NO: This object is a component of a bigger object
Q2) Is this component an inner or outer component
    INNER: Abstract
    OUTER: Interface

1) Human-C    2) Heart-A    3)Hair-I    4)Arm

5)House     6)Apartment     7)Floor     8)Door



Game part 2

Me: Name a feature
You: which entities (concrete, abstract, interface) allow this feature


1) Instance variable-AC
2) constructors - AC
3) constant values - ACI
4) method with NO default implementation - AI
5) method with default implementation - AC



*/


//
abstract class Shape{
    String name = "Shape";
    double length, width;
    
    public Shape(){}
    public Shape(String name, double length, double width){
        this.name = name;
        this.length = length;
        this.width = width;
    }
    public abstract double area();
    public abstract double perimeter();
    public abstract void foo(int a, String b);
}
abstract class ThreeDShape extends Shape{
    public abstract double depth();
    public ThreeDShape(){}
    public ThreeDShape(String name, double length, double width){
        super(name, length, width);
    }
}

abstract class AbExample implements sampleInterface2{
    public void method2(){}
}

interface CollegeCourse{
    
    int MAX_GRADE = 100, MIN_GRADE = 0;
    
    void assignments(String[] names);
    double tests(String test1, String test2);
    
}

interface sampleInterface1 extends CollegeCourse{
    
    void method1();
}

interface sampleInterface2{
    void method2();
}
interface sampleInterface3{
    void method3();
}
interface sampleInterface4 extends sampleInterface2, sampleInterface3{
    void method4();
}


class Comp1008 extends ThreeDShape implements CollegeCourse{
    
    @Override
    public void assignments(String[] names){}
    
    @Override 
    public double tests(String test1, String test2){
        return 1;
    }
    
     @Override
    public double perimeter(){
        return 2 * (length + width);
    }
    @Override
    public double area(){
        return length * width;
    }
    @Override
    public void foo(int a, String b){
        System.out.println(a + "-" + b);
    }
    
     @Override
    public double depth(){
        return 123;
    }
}

class Rectangle extends Shape{
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
    @Override
    public double area(){
        return length * width;
    }
    @Override
    public void foo(int a, String b){
        System.out.println(a + "-" + b);
    }
    
    public Rectangle(){}
    public Rectangle(String name, double length, double width){
        super(name, length, width);
    }

}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

abstract class Heart{
    int heartbeat;
    String size;
    public Heart(){}
    public Heart(int h, String s){
        heartbeat = h;
        size = s;
    }
abstract String pump();
abstract int chambers();
}

interface Hand{
    
    void grip();
    int TOTAL_FINGERS = 10;
}
interface Arm extends Hand{
    void flex();
    int JOINTS = 3;
}
interface Hair{}
class Human extends Heart implements Hair, Arm{
    
    public void flex(){}
    public void grip(){
        System.out.println(TOTAL_FINGERS + "-" + JOINTS);
    }
    
    
    String pump(){
        return null;
    }
    int chambers(){
        return 0;
    }
}

