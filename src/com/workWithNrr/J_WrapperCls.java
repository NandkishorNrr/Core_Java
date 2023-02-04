package com.workWithNrr;

public class J_WrapperCls {
    public static void main(String[] args) {
        Integer myInt = 65;
        Double myDouble = 5.123456;
//        etc

        System.out.println(myInt); //printing the object
        System.out.println(myInt.intValue());
        System.out.println(myInt.toString().length());
        System.out.println(myDouble.toString().length());
    }
}
