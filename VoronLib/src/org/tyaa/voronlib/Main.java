/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.voronlib;

/**
 *
 * @author yurii
 */
public class Main {
    
    private Main(){}
    
    public static String getWord(Integer _number){
        
        int number10 = _number % 10;
        int number100 = _number % 100;
        String result = "Voron";        
        if (!(number100 >= 11 && number100 <= 14)) {
            switch(number10){

                case 1: result = "Vorona"; break;
                case 2:
                case 3:
                case 4: result = "Voroni"; break;
            }
        }
        return result;
    }
}
