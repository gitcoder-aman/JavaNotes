package com.company;

class MyMainEmployee{

    private int id;
    private String name;

    //Constructor
    public MyMainEmployee(){
        id  = 45;
        name = "Your-Name-Here";
    }

    //constructor with arguments
    public MyMainEmployee(String myname,int myid){
        id = myid;
        name = myname;
    }

    public String getName(){return name;}
    public void setName(String n){this.name = n;}
    public void setId(int i){this.id = i;}

    public int getId() { return id;}
}
public class _18_Constructor {
    public static void main(String[] args) {

        //Mehtod Overloading with Constructor
          MyMainEmployee obj = new MyMainEmployee();
          MyMainEmployee obj1 = new MyMainEmployee("Programming",14);

        System.out.println(obj.getName());
        System.out.println(obj.getId());

        System.out.println(obj1.getName());
        System.out.println(obj1.getId());

    }
}
