package com.git;

public class Test01 {
    String str=new String("good");
    char[]ch={'a','b','c'};

    public static void main(String[] args) {
        Test01 test = new Test01();
        test.change(test.str,test.ch);
        System.out.println(test.str+"and");
        System.out.println(test.ch);
    }

    public void change(String str,char ch []){
        str="test ok";
        ch[0]='g';
    }
}
