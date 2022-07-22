package com.company;

abstract class Telephone{
    abstract  void ring();
    abstract  void lift();
    abstract  void disconnect();
}
interface BasicTelephone{
    void snap();
    void wifi();
}
class SmartTelephone extends Telephone implements BasicTelephone{

    @Override
    public void snap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void wifi() {
        System.out.println("Opening Wifi");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lifting");
    }
    public void disconnect(){
        System.out.println("Disconnecting");
    }
}
public class _31_PracticeAbstract {
    public static void main(String[] args) {

        //Ques - 4
        /* Create a class Telephone with Ring(), lift(), and disconnect() methods
        as Abstract Methods. Create another class Smart Telephone and demonstrate Polymorphism
         */

        Telephone tl = new SmartTelephone();
       // tl.wifi(); --> error cannot use snap method because the reference is telephone which does not have snap method
       // tl.snap(); --> error cannot use snap method because the reference is telephone which does not have snap method

        tl.ring();
        tl.lift();
        tl.disconnect();

        BasicTelephone btl = new SmartTelephone();
        btl.snap();
        btl.wifi();

        SmartTelephone smt = new SmartTelephone();
        //all function are access
        smt.ring();
        smt.snap();
        smt.disconnect();
        smt.lift();
        smt.wifi();

    }
}
