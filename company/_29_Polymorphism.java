package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi2{
    public String[] getNetworks();
    void connectToNetwork(String Network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Taking Record");
    }

   /* @Override
    public void record4KVideo() {
        System.out.println("Taking Snap and Recording in 4K");
    }*/

    public String [] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Airtel","Jio","Idea"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public class _29_Polymorphism {
    public static void main(String[] args) {

        MyCamera2 cam1 = new MySmartPhone2();
        //cam1.getNetwork(); // Not allowed
        cam1.record4KVideo();

        MySmartPhone2 s = new MySmartPhone2();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(23367);
    }
}
