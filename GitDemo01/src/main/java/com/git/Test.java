package com.git;

public class Test {

    public static void main(String[] args) {

        String str="151@51515@@dsajdasd";
        String remove = remove(str);
        System.out.println(remove);
    }

     static String remove(String str){
        int i = str.indexOf("@");
        if (i==-1){
            return str;
        }
        StringBuffer sb = new StringBuffer(str);
       sb.deleteCharAt(i);
       return  remove(sb.toString());

    }

}
