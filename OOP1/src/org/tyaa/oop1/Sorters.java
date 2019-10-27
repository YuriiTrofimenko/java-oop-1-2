/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1;

import java.util.List;

/**
 *
 * @author yurii
 */
public class Sorters {
    
    public static void intSort(List<Integer> integers){
        boolean ordered = false;
        while (!ordered) {
            ordered = true;
            for (int i = 0; i < integers.size() - 1; i++) {
                if ((integers.get(i) - integers.get(i + 1)) < 0) {
                    Integer temp = integers.get(i);
                    integers.set(i, integers.get(i + 1));
                    integers.set(i + 1, temp);
                    ordered = false;
                }
            }
        }
        
    }
    
    public static void sort(List items, IComparator comparator){
        boolean ordered = false;
        while (!ordered) {
            ordered = true;
            for (int i = 0; i < items.size() - 1; i++) {
                if (comparator.compare(items.get(i), items.get(i + 1)) > 0) {
                    Object temp = items.get(i);
                    items.set(i, items.get(i + 1));
                    items.set(i + 1, temp);
                    ordered = false;
                }
            }
        }
        
    }
}
