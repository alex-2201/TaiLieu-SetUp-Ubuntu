/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.LinkedHashMap;

/**
 *
 * @author thena
 */
public class LinkedHashMapExample1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "C++");
        linkedHashMap.put(3, "Python");
        linkedHashMap.put(4, "NodeJS");
        linkedHashMap.remove(3);
        linkedHashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
