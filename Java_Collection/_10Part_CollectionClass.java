package com.Java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _10Part_CollectionClass {
    public static void main(String[] args) {

        List<_10CustomClass> list = new ArrayList<>();

        list.add(new _10CustomClass("Aman",2));
        list.add(new _10CustomClass("Ramesh",4));
        list.add(new _10CustomClass("Shivam",3));
        list.add(new _10CustomClass("Rohit",1));

        _10CustomClass s1 = new _10CustomClass("Anuj",2);
        _10CustomClass s2 = new _10CustomClass("Rohit",3);

        System.out.println(list);
        //System.out.println(s1.compareTo(s2));

        // Sorted by name
       Collections.sort(list,new Comparator<_10CustomClass>(){

           public int compare(_10CustomClass o1, _10CustomClass o2){
               return o1.name.compareTo(o2.name);
           }
        });
        System.out.println(list);
    }
}
