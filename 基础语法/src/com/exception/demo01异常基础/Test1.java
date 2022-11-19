package com.exception.demo01异常基础;

public class Test1 {
    public static void main(String[] args) {


        /*
        int a = 1;
        int b = 0;
        //异常三件套
        try {//try 监控区域
            System.out.println(a/b);
        }catch(ArithmeticException e){//catch捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }finally {//善后
            System.out.println("finally");
        }

        //finally  可以不要finally    IO资源关闭善后
         */


        //=========================
        try {
            new Test1().a();
        }catch (Error e){                   //优先级   小↓大（类比else if）
            System.out.println("Error");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        catch (Throwable t){
            System.out.println("Throwable");
        }
        finally
         {
            System.out.println("finally");
        }

    }

    public void  a(){
        b();
    }
    public  void  b(){
        a();
    }
}
