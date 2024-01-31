package com.lb.innerclass;

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();

    }
}

class Outer04 {//外部类
    private int n1 = 10;//属性

    public void method() {//方法
        //基于接口的匿名内部类
        //1.需求； 想使用IA接口，并创建对象
        //2.传统方式，写一个类，实现该接口，并创建对象
        //3.需求Tiger只使用一次，后面不在是使用
        //4.可以使用匿名类来简化开发
        //5.tiger的编译类型？ IA
        //6.tiger的运行类型？ 就是匿名内部类
        /*
        我们看底层
        class XXXX implements IA{
           @Override
            public void cry() {
                System.out.println("老虎叫唤。。。。");
            }
         }
         */

        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤。。。。");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();

        //演示基于类的匿名内部类
        //分析
        //1.father 编译类型 Father
        //2.father 运行类型 Outer04$2
        //3.底层会创建匿名内部类
        //4.注意("jack")参数列表会传递给 构造器
        Father father = new Father("jack") {


            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father的运行类型=" + father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头...");
            }
        };
        animal.eat();
    }
}

interface IA {//接口

    public void cry();
}

class Father {//类

    public Father(String name) {//构造器
        System.out.println("接收到name=" + name);
    }

    public void test() {

    }
}

abstract class Animal {//抽象类

    abstract void eat();
}