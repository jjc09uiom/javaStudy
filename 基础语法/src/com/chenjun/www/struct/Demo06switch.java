package com.chenjun.www.struct;

public class Demo06switch {
    public static void main(String[] args) {
        String name = "简直像空气";
        switch(name){
            case "简直像空气" :
                System.out.println("简直像空气");
                break;
            case "chenjun" :
                System.out.println("chenjun");
                break;
            default:
                System.out.println("啥也不是");
        }


        //反编译  java----class（字节码文件)-----反编译（IDEA）
    }
}
