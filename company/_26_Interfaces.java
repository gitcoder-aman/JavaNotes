package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
   public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornk3g(){
        System.out.println("Applying blowHorn3kg");
    }
    public void blowHornmhn(){
        System.out.println("Applying blow mai hu n");
    }
}
public class _26_Interfaces {
    public static void main(String[] args) {

        AvonCycle cycleAman = new AvonCycle();
        cycleAman.applyBrake(1);
        //You can create properties in Interfaces
        System.out.println(cycleAman.a);

        //You cannot modify the properties in Interfaces as they are final
       // cycleAman.a = 46;

        cycleAman.blowHornk3g();
        cycleAman.blowHornmhn();

    }
}
