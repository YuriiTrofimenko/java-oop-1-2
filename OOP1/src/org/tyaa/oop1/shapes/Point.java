/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1.shapes;

import org.tyaa.oop1.IShape;

/**
 *
 * @author yurii
 */
public class Point implements IShape, Comparable<Point>{

    public Integer x;
    public Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void show() {
        System.out.printf("%s: x = %d; y = %d", this.getClass().getSimpleName(), x, y);
    }

    @Override
    public int compareTo(Point o) {
        return this.y - o.y;
    }
    
    @Override
    public Integer getY() {
        return y;
    }
}
