/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author thena
 */
public class MapExample1 {
    public static void main(String[] args) {
        // init map
        Map<Integer, String> map = new HashMap<>();
        
        map.put(100, "A");
        map.put(1000, "B");
        map.put(102, "C");
        
        Set<Integer> set  = map.keySet();
        // Using set of 'key'
        set.forEach((key) -> {
            System.out.println(key + " " + map.get(key));
        });
        
        
        // entry = 1 element in Map.
        // Entry is a nested class in Map class.
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
    
}
