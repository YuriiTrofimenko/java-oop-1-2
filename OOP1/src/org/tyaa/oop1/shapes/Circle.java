/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1.shapes;

import org.tyaa.oop1.IScalable;
import org.tyaa.oop1.IShape;

/**
 *
 * @author yurii
 */
public class Circle implements IShape, IScalable, Comparable<Circle> {
    
    public Point center;
    public Integer radius;

    public Circle(Point center, Integer radius) {
        this.center = center;
        this.radius = radius;
    }
    
    @Override
    public void show() {
        System.out.printf("%s: x = %d; y = %d; r = %d", this.getClass().getSimpleName(), center.x, center.y, radius);
    }

    @Override
    public void scale(Integer ratio) {
        radius *= ratio;
    }
    
    @Override
    public int compareTo(Circle o) {
        return this.center.y - o.center.y;
    }

    @Override
    public Integer getY() {
        return center.y;
    }
    
    
}
