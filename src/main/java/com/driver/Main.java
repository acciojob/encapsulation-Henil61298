package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
//        System.out.println(r.name); Error: java: name has private access in com.driver.RWOnly

        r.setName("Henil");
        System.out.println(r.getName());
    }
}