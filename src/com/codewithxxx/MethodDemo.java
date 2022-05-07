package com.codewithxxx;

public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        isEevenNumber(10);  //10为实参 方法调用中的参数 等同于使用变量或产量
    }
    //判断是否是偶数
   public static void isEevenNumber(int number){ //此处int number是形参 方法定义中的变量 等同于变量定义格式
    //定义变量
        if(number%2==0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
   }
}
//方法的定义与调用 带参数的方法  i