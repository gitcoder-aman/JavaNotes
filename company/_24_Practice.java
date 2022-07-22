package com.company;

class Circle{

    public  int radius;
    Circle(){
        System.out.println("I am Not Parameterized Circle");
    }
    Circle(int r) {
        System.out.println("I am Circle Parameterized Circle");
        this.radius = r;
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder extends Circle{

    public int height;

    Cylinder(int r,int h) {
        super(r);
        System.out.println("I am Cylinder parametrized Constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class _24_Practice {
    public static void main(String[] args) {


        //Circle objc = new Circle(10);
        Cylinder obj = new Cylinder(12,4);

    }
}
