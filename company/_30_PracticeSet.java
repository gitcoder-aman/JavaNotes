package com.company;
//Ques - 1
abstract class Pen{

    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen{

    void write(){
        System.out.println("Write");
    }

    @Override
    void refill() {
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
//Ques - 3
class Monkey{

    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal {

    void speak(){
        System.out.println("Hello Sir! ");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
//Q - 5 Demonstrate polymorphism using monkey class from Question 3
public class _30_PracticeSet {
    public static void main(String[] args) {

        //1. Create an abstract class pen with methods write() and refil()
        // as abstract methods

        fountainPen pen = new fountainPen();
        pen.changeNib();

        //Q - 2
        Human obj = new Human();
        obj.sleep();

        //Q- 5
        Monkey m1 = new Human();
        //m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method
        m1.jump();
        m1.bite();

        BasicAnimal lovish = new Human();
       // lovish.speak();
        lovish.eat();
        lovish.sleep();
    }
}
