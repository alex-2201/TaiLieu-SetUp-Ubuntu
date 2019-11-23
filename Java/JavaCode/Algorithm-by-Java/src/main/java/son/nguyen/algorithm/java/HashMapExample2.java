/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.HashMap;

/**
 *
 * @author thena
 */

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        hashMap.put("1", new Student(213 ,"A", 12, "Hanoi"));
        hashMap.put(null, new Student(21313 ,"C", 13, "Hanoi"));
        hashMap.put("2", null);
        hashMap.put("4", new Student(4184 ,"D", 14, "Hanoi"));
        
        // show
        show(hashMap);
    }

    private static void show(HashMap<String, Student> hashMap) {
        hashMap.entrySet().forEach((var entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
