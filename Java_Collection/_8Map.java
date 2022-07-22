package com.Java_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _8Map {
    public static void main(String[] args) {

       // Map<String,Integer> numbers = new HashMap<>();
// key is unique and unsorted order put
        Map<String,Integer>numbers = new TreeMap<>(); // Inputted by sorted Order in alphabet of key
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);

        if (!numbers.containsKey("Two"))
        numbers.put("Two",23); // key is present in map then value is overwrite

        numbers.putIfAbsent("Two",23);// behaviour same of if condition
        numbers.remove("Three");

        System.out.println(numbers);

        System.out.println("Now lets iterate");

        for (Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("Only print to key");
        for (String key : numbers.keySet()){
            System.out.println(key);
        }
        System.out.println("Only Print to value");
        for (Integer value : numbers.values()){
            System.out.println(value);
        }

        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.containsKey("Four"));


    }
}
