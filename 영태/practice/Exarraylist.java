package 영태.practice;

import java.util.*;

public class Exarraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Hello World");
        list.add(null);
        boolean isFindValue = list.contains("Hello World");
        list.remove(0);
        for(String value : list){
            System.out.println(value);
        }
    }
}
