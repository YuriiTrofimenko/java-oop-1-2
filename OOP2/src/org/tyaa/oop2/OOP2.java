/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.oop2;

import java.util.function.Predicate;

/**
 *
 * @author yurii
 */
public class OOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* OuterClass.StaticInnerClass.say();
        OuterClass.InnerClass inner2 = new OuterClass().new InnerClass();
        inner2.say(); */
        
        /* for (int i = 0; i < 1000; i++) {
            new Garbage();
        } */
        
        //UserFactory userFactory = User::new;
        //User user = userFactory.create("John", "Snow");
        
        // users.sort(Comparator.comparing(User::getName));

        //***

        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(-8));
        
        /* BinaryOperator<Integer> multiply = (x, y) -> x*y;
        UnaryOperator<Integer> square = x -> x*x;
        Function<Integer, String> convert = x-> String.valueOf(x) + " долларов";
        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        Supplier<User> userFactory = ()->{             
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        }; */

        /* public <T> List<T> foo(T[] a)
        public static <T, G> List<G> foo2(T[] a, Function<T, G> b)
        public <T extends Number> List<T> foo3(T[] a)
        public <T extends Number & Comparable>
         List<T> foo4(T[] a)
        public static void foo5(List<? extends MyType> a) */

        
    }
    
}
