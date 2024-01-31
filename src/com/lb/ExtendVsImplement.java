package com.lb;

public class ExtendVsImplement {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climb();
        littleMonkey.flying();
        littleMonkey.swimming();

    }
}

class monkey {
    private String name;

    public monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climb() {
        System.out.println(name + " 会爬树....");
    }
}
//接口
interface Fishable{
    void swimming();
}
interface Birdable{
    void flying();
}
class LittleMonkey extends monkey implements Fishable,Birdable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+" 通过努力学会了游泳...");
    }

    @Override
    public void flying() {
        System.out.println(getName()+" 通过努力学会了飞翔...");
    }
}