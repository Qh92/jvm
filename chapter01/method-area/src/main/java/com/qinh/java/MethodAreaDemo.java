package com.qinh.java;

/**
 *  测试设置方法区大小参数的默认值
 *  jdk7及以前：
 *  -XX:PermSize=100m -XX:MaxPermSize=100m
 *  jdk8及以后：
 *  -XX:MetaspaceSize=100m  -XX:MaxMetaspaceSize=100m
 *
 * @author Qh
 * @version 1.0
 * @date 2021-07-02-0:12
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
