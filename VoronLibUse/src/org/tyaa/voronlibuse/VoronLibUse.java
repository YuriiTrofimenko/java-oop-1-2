/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.voronlibuse;

import java.util.Scanner;

/**
 *
 * @author yurii
 */
public class VoronLibUse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Input an integer number from 0 to infinity:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        System.out.println(org.tyaa.voronlib.Main.getWord(number));
    }
    
}
