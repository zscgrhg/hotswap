package com.example.hot;

/**
 * Created by THINK on 2016/12/15.
 */
public class HowItWorks {
    public static void testStatic() {
        System.out.println("static eee");
    }
    public void testReload(){
        System.out.println("ops12");
    }
    public static void main(String[] args) throws InterruptedException {
        while (true){
            new HowItWorks().testReload();
            testStatic();
            System.out.println("static ttt");
            Thread.sleep(2000L);
        }
    }
}
