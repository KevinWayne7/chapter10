package com.lb.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.fi();

    }
}

class Outer05 {
    private int n1 = 99;

    public void fi() {
        //创建一个基于类的匿名内部类
        Person p = new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi()方法");
            }
        };
        p.hi();
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名方法再次重写了 hi()方法");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("liubo");
    }
}

class Person {
    public void hi() {
        System.out.println("Hello");
    }

    public void ok(String str) {
        System.out.println("Person ok() " + str);
    }

}