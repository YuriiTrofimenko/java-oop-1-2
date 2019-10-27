/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop2;

/**
 *
 * @author yurii
 */
public class OuterClass {
    
    private static String outerText = "Outer";
    
    /* Inner Classes */
    
    public static class StaticInnerClass {
    
        public static void say(){
            System.out.println(outerText);
        }
    }
    
    public class InnerClass {
    
        public void say(){
            System.out.println(outerText);
        }
    }
}
