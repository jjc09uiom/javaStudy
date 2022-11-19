package com.exception.demo02自定义异常;
//自定义的异常类
public class MyException extends Exception{

    //传递数字>10 抛出异常
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    //toString:异常的打印信息

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
