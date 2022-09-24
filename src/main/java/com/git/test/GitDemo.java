package com.git.test;

public class GitDemo {
    public static void main(String[] args) {
        System.out.println("原始版本1.01.01");
        System.out.println("修复版本1,01.02");
        System.out.println("修复版本1,01.03");
        function_fix();
        function_mixed();
    }

    public static void function_fix(){
        System.out.println("修复功能版本1.02.01");
    }

    public static void function_mixed(){
        System.out.println("双分支修复版本1.03.00");
    }
}
