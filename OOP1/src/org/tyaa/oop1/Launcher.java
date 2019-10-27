/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author yurii
 */
public class Launcher {
    
    private String text = "Hello Streams!";
    
    public void launch(){
        
        List<Person> people =
                Arrays.asList(
                        new Person("John", 39)
                        , new Person("Bill", 40)
                        , new Person("Vasil", 20)
                        , new Person("Masha", 23)
                        , new Person("Boris", 23)
                );
        
        Sorters.sort(people, new IComparator() {
            @Override
            public Integer compare(Object o1, Object o2) {
                // return ((Person)o1).name.compareTo(((Person)o2).name);
                System.out.println(Launcher.this.text);
                return ((Person)o2).age - ((Person)o1).age;
            }
        });
    }
}
