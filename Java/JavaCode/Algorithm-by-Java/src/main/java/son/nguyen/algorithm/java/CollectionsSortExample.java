/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author thena
 */
public class CollectionsSortExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("Python");
        list.add("Nodejs");
        
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        
        List<Double> list2 = new ArrayList<Double>();
        list2.add(12.0);
        list2.add(42.2);
        list2.add(1.23);
        list2.add(0.1);
        Collections.sort(list2);
        System.out.println(list2);
        Collections.sort(list2, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1 > o2 ? -1  : 1;
            }
        });
        System.out.println(list2);
        
    }
}
