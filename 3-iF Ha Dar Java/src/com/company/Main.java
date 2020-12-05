package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // write your code here
        //در این خط ما دو عدد متغیر از نوع استرینگ تعریف کردیم وبه هرکدام از ان ها مقداری دادیم
        String username = "Ashkan";
        String password = "123";


        //برسی درست بودن شرط
        if (username == "Ashkan" && password == "123"){
            System.out.println("Ashkan Rahmani Welllcome");
            /**
             *         در اینجا ما با استفاده از دستور  if  مقدار های ان هارا در شرطی گذاشتیم اگر برابر با شرط ما بود یک متن را در خروجی چاپ کند
             *
             */
        }
        //و در این خط اگر شرط ما درست نبود پیغام زیر نمایش داده شود
        else {
            System.out.println("Faild Login");
        }


    }
}
