package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}




class Shape{
    public double getArea(){
      return 0;
    }
}


class Rectangle extends Shape{
    private double width;
    private double height;


    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;

    }

//    @Override
    public double getArea() {
        return width*height;
    }
}

class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

}
class Driver{
    public static void main(String args[]){
        Shape[] shape=new Shape[2]; //Creating Shape array of size 2;
        shape[0]=new Circle(2);
        shape[1]=new Rectangle(2,4);

        System.out.println(shape[0].getArea());
        System.out.println(shape[1].getArea());
    }
}





// Base class Bird
class Bird {

    // Common trait of all birds so implemented in the base class
    public void eat() {
        System.out.println(getClass().getSimpleName() + " is eating!");
    }

}// End of Bird class

interface CanFly {

    // The method is by default abstract and public
    void flying();

}// End of CanFly interface

//class Parrot extends Bird implements CanFly { // Parrot is extending from Bird and implementing CanFly
//
//    @Override               // If you don't implement the flying() you will get an error!
//    public void flying() { // Overriding the method of CanFly interface
//        System.out.println("Parrot is Flying!");
//    }
//} // End of Parrot class
//
//class Penguin extends Bird { // Penguin is a bird so extending from Bird
//
//    // Penguin cannot fly so not implementing CanFly
//    public void walk() {
//        System.out.println("Penguin is Walking!");
//    }
//
//} // End of Penguin class
//
//class Main {
//
//    public static void main(String[] args) {
//
//        Parrot parrot = new Parrot();   // Creating the Parrot object
//        Penguin penguin = new Penguin(); // Creating the Penguin object
//
//        parrot.eat();
//        parrot.flying();
//
//        System.out.println();    // Just creating a newline on console
//
//        penguin.eat();
//        penguin.walk();
//
//    } // End of main()
//
//} // End of Main class



//interface InterfaceA {
//
//    default void printSomething() {
//        System.out.println("I am inside A interface");
//    }
//}


//public interface InterfaceB {
//
//    default void printSomething() {
//        System.out.println("I am inside B interface");
//    }
//}


//public class Main implements InterfaceA, InterfaceB {
//
//    @Override
//    public void printSomething() {
//
//        //Option 1 -> Provide our own implementation.
//        System.out.println("I am inside Main class");
//

//        //Option 2 -> Use existing implementation from interfaceA or interfaceB or both.
//        InterfaceA.super.printSomething();
//        InterfaceB.super.printSomething();
//    }
//
//    public static void main(String args[]){
//        Main main = new Main();
//        main.printSomething();
//    }
//}
