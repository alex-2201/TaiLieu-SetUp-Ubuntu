/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author thena
 */
public class CollectionClassExample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        
        list.add("C++");
        list.add("Java");
        list.add("Python");
        System.out.println(list);
        
        Collections.addAll(list, "NodeJS", "C#");
        System.out.println(list);
        
        String[] strArr = {"Javascript", ".Net"};
        Collections.addAll(list, strArr);
        System.out.println(list);
        
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
 
}
