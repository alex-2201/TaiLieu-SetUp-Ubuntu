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
public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");
        hashMap.put(3, "Python");
        hashMap.put(100, "NodeJS");
        
        hashMap.remove(100);
        show(hashMap);
    }

    private static void show(HashMap<Integer, String> hashMap) {
        hashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
