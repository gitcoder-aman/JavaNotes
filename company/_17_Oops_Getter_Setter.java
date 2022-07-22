package com.company;

class MyEmployee{
    private int id;
    private String name;

    public  String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
public class _17_Oops_Getter_Setter {


    public static void main(String[] args) {

     MyEmployee obj = new MyEmployee();

     obj.setId(334);
     obj.setName("AMAN KUMAR");
        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }

}
