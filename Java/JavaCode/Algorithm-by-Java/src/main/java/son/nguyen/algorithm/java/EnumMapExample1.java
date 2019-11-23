/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.EnumMap;

/**
 *
 * @author thena
 */
public class EnumMapExample1 {
    public enum Days {
        Monday, Tuesday, Wednesday, Thursday, Friday
    };
    
    public static void main(String[] args) {
        EnumMap<Days, String> enumMap = new EnumMap<Days, String>(Days.class);
        enumMap.put(Days.Monday, "1");
        enumMap.put(Days.Tuesday, "2");
        enumMap.put(Days.Wednesday, "3");
        enumMap.put(Days.Thursday, "4");
        enumMap.put(Days.Friday, "5");
        
        enumMap.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
        
        enumMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        
    }
    
}
