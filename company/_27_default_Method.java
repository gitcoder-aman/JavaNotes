package com.company;

interface MyCamera{
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
interface MyWifi{
   public String[] getNetworks();
    void connectToNetwork(String Network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
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
public class _27_default_Method {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
       // ms.greet(); throw an error
       String[] ar =  ms.getNetworks();
        for (String item:ar)
        {
            System.out.println(item);
        }
    }
}
