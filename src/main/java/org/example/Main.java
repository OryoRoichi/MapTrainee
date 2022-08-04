package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Map<Integer,String> oldMap = new HashMap<>();
        fillMap(oldMap);
        System.out.println(smth(oldMap));
    }
    public static void fillMap(Map<Integer,String>oldMap){
        oldMap.put(1,"Один");
        oldMap.put(2,"Два");
        oldMap.put(3,"Три");
    }
    public static Map<String, List<Integer>> smth(Map<Integer,String> oldMap){
        Map<String,List<Integer>> newMap = new HashMap<>();
        oldMap.forEach((key, elem)->{
            List<Integer> list = new ArrayList<Integer>();
            list.add(key);
            newMap.put(elem,list);
        });
        return newMap;
    }
}