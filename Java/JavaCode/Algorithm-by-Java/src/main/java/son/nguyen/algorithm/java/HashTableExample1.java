/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.Hashtable;

/**
 *
 * @author thena
 */
public class HashTableExample1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        
        hashtable.put(3, "C++");
        hashtable.put(1, "Java");
        hashtable.put(2, "Python");
        hashtable.put(2232, "NodeJS");
        
        hashtable.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        
        hashtable.remove(1);
        
        System.out.println("After remove: ");
        
        hashtable.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
