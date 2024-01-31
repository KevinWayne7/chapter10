package com.lb.innerclass;

public class InnerClassExercise {
    public static void main(String[] args) {
        Test t = new Test();
        Test.Inner inner = t.new Inner();
        System.out.println(inner.a);
    }

}

class Test {
    class Inner {
        public int a = 5;
    }
    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);

    }
}

