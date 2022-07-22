package com.company;

class Phone{

    public void ShowTime(){
        System.out.println("Time is 8 Am ");
    }
    public void on(){
        System.out.println("Turning on Phone....");
    }

}
  class SmartPhone extends  Phone{

    public  void music(){
        System.out.println("Playing Music ");
    }
    @Override
    public void on() {
        System.out.println("Turning on SmartPhone....");
    }
}
public class _23_DynamicMethodDispatch {
    public static void main(String[] args) {

       Phone obj = new SmartPhone(); // Yes it is allowed // Dynamic method Dispatch
        //SmartPhone obj2 = new Phone(); // Not Allowed
       obj.ShowTime();
       obj.on();

       //obj.music(); // Not Allowed
    }
}
