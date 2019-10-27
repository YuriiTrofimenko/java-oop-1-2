/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.tyaa.oop1.shapes.Circle;
import org.tyaa.oop1.shapes.Point;
import org.tyaa.voronlib.Main;

/**
 *
 * @author yurii
 */
public class OOP1 {
    
    static {
        
    }
    
    public OOP1(){
    
        //super();
        //super.getClass();
        System.out.println(super.getClass());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*for (Long i = 0L; i < 45; i++) {
            System.out.println(fib(i));
        }*/
        
        // Main.getWord(0);
        // Object o = new Main();
        // System.out.println(o);
        // new OOP1();
        
        /*List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(-4);
        integers.add(0);
        integers.add(200);*/
        
        // List<String> strings = Arrays.asList("John", "Bill", "Vasil", "Masha");
        
        /* Sorters.intSort(integers);
        integers.forEach((i) -> {
            System.out.println(i);
        }); */
        
        /* Sorters.sort(integers, new IComparator() {
            @Override
            public Integer compare(Object o1, Object o2) {
                return (Integer)o2 - (Integer)o1;
            }
        });
        integers.forEach((i) -> {
            System.out.println(i);
        }); */
        
        /*Sorters.sort(strings, new IComparator() {
            @Override
            public Integer compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        strings.forEach((s) -> {
            System.out.println(s);
        });*/
        
        /* List<Person> people =
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
                return ((Person)o2).age - ((Person)o1).age;
            }
        }); */
        
        /* Sorters.sort(people, (o1, o2) -> {
            return ((Person)o1).age - ((Person)o2).age;
        });
        
        people.forEach((p) -> {
            System.out.println(p);
        }); */
        
        // TODO
        // Создать в классе Sorters еще один метод,
        // который сможет сортировать объекты по двум заданным полям,
        // так, чтобы конечный результат сохранял порядок по первому правилу,
        // а по второму были упорядочены только те объекты, которые равны
        // между собой с точки зрения первого правила сортировки
        
        List<IShape> shapes =
                Arrays.asList(
                        new Point(0, 10)
                        , new Point(-100, 20)
                        , new Circle(new Point(0, 0), 120)
                        , new Circle(new Point(-90, 330), 320)
                        , new Point(44, 50)
                );
        
        /* shapes.stream()
                .sorted((o1, o2) -> {
                    return o2.getY() - o1.getY();
                })
                .filter((shape) -> {
                    return shape.getY() <= 300;
                })
                .forEach((shape) -> {
                    if (shape instanceof IScalable) {
                        ((IScalable)shape).scale(2);
                    }
                    shape.show();
                    System.out.println();
                }); */
        
        // int x = 10;
        final int x = 10;
        
        List<Integer> yList = shapes.stream()
                .sorted((o1, o2) -> {
                    return o2.getY() - o1.getY();
                })
                .filter((shape) -> {
                    // x++;
                    //System.out.println(x);
                    return shape.getY() <= 300;
                })
                .map((shape) -> {
                    return shape.getY();
                })
                .collect(Collectors.toList());
        /*for (Integer integer : yList) {
            System.out.println(integer);
        }*/
        yList.forEach(System.out::println);
        // new Launcher().launch();
    }
    
    // private
    // protected
    // package
    public static Long fib(Long _number){
    
        if (_number <= 0) {
            return 1L;
        }
        return fib(_number - 1) + fib(_number - 2);
    }
}
