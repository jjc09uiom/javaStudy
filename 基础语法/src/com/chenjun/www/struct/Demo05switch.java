package com.chenjun.www.struct;

public class Demo05switch {
    public static void main(String[] args) {
        /*
        switch(expression){------------->可以是byte/short/int/char,从JAVASE7开始支持String
        case value :
            //语句
            break;//可选
        case value :
            //语句
            break;//可选
            //可以有任意数量 的case语句
        default ://可选
                //语句
           }
         */
        char grade = 'C';

        switch (grade){//不写break会发生case穿透现象
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
                System.out.println("良好");
                break;
            case 'C' :
                System.out.println("及格");
                break;
            case 'D' :
                System.out.println("再接再厉");
                break;
            case 'E' :
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
