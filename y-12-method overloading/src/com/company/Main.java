package com.company;

import java.util.Arrays;
public class Main {
    /**
     *ما در این برنامه ۳ فانکشن هم نام ساختیم و فقط متفیر های اون ها فرق داره
     * و با استفاده از اورلدینگ به متد یا فانکشن ما هر مقداری که بدی اون رو چاپ میکنه
     * که به این میگن اورلودینگ
     *
     */
    public static void main(String[] args) {

	// write your code here

        //فراخوانی فانکشن ها
        getme(10,12,55,22);
        getme(10.5,11.1,20.22);
        getme("ali","mamad","asqar");
    }

    /**
     *در این فانکشن ها با ورودی دلخواه کاربر کار میکند هر چندتا که کاربر ورودی بدهد
     * همان ورودی هارو در خروجی نمایش میدهد
     * و از اورلودینگ استفاده شده
     * یعنی فرقی ندارد که ورودی رشته باشد یا عدد هر نوعی از ورودی باشد آن را چاپ میکند
     */

    public static void getme(int ... variables){
        for (int getnumbers:
             variables)System.out.println(getnumbers);
    }

    public static void getme(double ... variables){
        for (double getnumbers:
             variables)System.out.println(getnumbers);
    }

    public static  void getme(String ... variables){
        for (String getmeStr:
             variables)System.out.println(getmeStr);
    }

/**
 * در بدنه تمام فانکشن ها از Foreach استفاده شده که ورودی که گرفته میشه به صورت آرایه گرفته و در متغیر دیگری ریخته و چاپ می کند
 */
}
