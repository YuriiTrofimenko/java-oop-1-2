/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yurii
 */
public class Garbage {
    
    private List<String> list = new ArrayList();
    
    public Garbage(){
        for (Integer i = 0; i < 10000; i++) {
            list.add(i.toString());
        }
        System.out.printf("%s created \n", this);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.printf("%s finalized \n", this);
    }
    
    
}
