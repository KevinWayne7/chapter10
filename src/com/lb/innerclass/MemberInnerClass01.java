package com.lb.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类，使用成员内部类的二种方式
        //第一种方式
        //outer08.new Inner08(); 相当于把 new Inner08()当做是outer08成员
        //这就是一个语法

        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();


        //第二种方式 在外部类中，编写一个方法，可以返回 Inner08对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();


    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";

    class Inner08 {//成员内部类
        private double sal = 99.8;
        private int n1 = 66;

        public void say() {
            //可以直接访问外部类的所有成员，包括私有的
            //如果外部类成员和内部类成员重名时，会遵循就近原则
            //可以通过 外部类名.this.属性 来访问外部类的成员
            System.out.println("n1= " + Outer08.this.n1 + "  name= " + name);
        }
    }

    //方法，返回一个Inner08()
    public Inner08 getInner08Instance() {
        return new Inner08();
    }

    public void t1() {
        //使用成员内部类
        //创建成员成员内部类的对象，然后使用相关的方法
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println("inner08 sal=" + inner08.sal);
    }
}
