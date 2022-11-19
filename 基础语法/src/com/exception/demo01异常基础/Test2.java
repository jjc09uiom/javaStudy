package com.exception.demo01异常基础;

public class Test2 {
    public static void main(String[] args) {

        /*
        int a = 1;
        int b = 0;
        //加try-catch快捷键：ctrl + alt + t
        try {
            if(b==0){//throw  throws
                throw new ArithmeticException();//主动抛出异常
            }
            System.out.println(a/b);
        } catch (Exception e) {
            System.exit(1);//结束进程
            e.printStackTrace();//打印错误的栈信息
        } finally {

        }
         */
        //===============================
        try {
            new Test2().test(1,0);//用catch捕获意料中的异常，可以让程序继续正常运行下去，而不会终止
        } catch (ArithmeticException e) {
            System.out.println("come on");
            e.printStackTrace();
        }

    }
    //假设这个方法中，处理不了这个异常,方法上抛出异常
    public void test(int a,int b)throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException();//一般在方法中主动抛出异常
        }
    }
}
