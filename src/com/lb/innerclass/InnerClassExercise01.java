package com.lb.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //当作实参直接传递，简介高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画.....");
            }
        });

    }
    //静态方法,形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}//接口

interface IL {
    void show();

}
