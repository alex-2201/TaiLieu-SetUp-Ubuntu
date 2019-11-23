/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author thena
 */
public class TreeMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(-1, "Java");
        treeMap.put(2, "C++");
        treeMap.put(33, "Python");
        treeMap.put(-4, "NodeJS");
        treeMap.remove(23);
        treeMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
