package com.qinh.java;

/**
 * @author Qh
 * @version 1.0
 * @date 2021-06-23-0:44
 */
class Father {
    public static void print(String str) {
        System.out.println("father " + str);
    }
    private void show(String str) {
        System.out.println("father " + str);
    }
}
class Son extends Father {
}
public class VirtualMethodTest {
    public static void main(String[] args) {
        Son.print("coder");
        //Father fa = new Father();
        //fa.show("cooooder");
    }
}
