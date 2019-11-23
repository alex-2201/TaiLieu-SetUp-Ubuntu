/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.nguyen.algorithm.java;

import java.util.EnumSet;
import java.util.Set;

/**
 *
 * @author thena
 */

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample1 {
    public static void main(String[] args) {
        Set<days> set =  EnumSet.of(days.MONDAY, days.TUESDAY, days.WEDNESDAY);
        
        set.forEach(day -> {
            System.out.println(day);
        });
        
   }
}
