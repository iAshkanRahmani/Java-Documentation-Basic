package com.company;

//اضافه کردن کتاب خانه برای MesaageFormat
import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        // متغیر ها
        int num1;
        int num2;
        double num3;
        double num4;
        float num5;
        boolean boolvalue;
        char myChar;


        //مقدار دهی به متفیر ها

        num1 = 1;
        num2 = 2;
        num3 = 3.45;
        num4 = 4.12;
        num5 = 2.4f;
        boolvalue = true;
        myChar = 'A';

        //نمایش مقدار متفیر ها در خروجی
        //و از کتاب خانه MessageFormat استفاده کردیم برای زیبایی و خوانایی رشته در خروجی
        System.out.println(MessageFormat.format("num1 : {0}",num1));
        System.out.println(MessageFormat.format("num2 : {0}",num2));
        System.out.println(MessageFormat.format("num3 : {0}",num3));
        System.out.println(MessageFormat.format("num4 : {0}",num4));
        System.out.println(MessageFormat.format("num5 : {0}",num5));
        System.out.println(MessageFormat.format("Boolean : {0}",boolvalue));
        System.out.println(MessageFormat.format("Mychar : {0}",myChar));


    }
}

