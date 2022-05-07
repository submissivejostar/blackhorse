package com.codewithxxx;



public class getReturnTest {
    public static void main(String[]args){
        System.out.println(getCompare(4,2));
    }
    public  static int getCompare(int a, int b){
        if(a>b){
            return  a;
        }else{
            return  b;
        }
    }
}

