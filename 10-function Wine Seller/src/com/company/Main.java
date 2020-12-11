package com.company;

import java.util.Arrays;


/**
 * در کد زیر یک برنامه فانکشن نوشتیم که با دادن یک سن به اون میتونیم بسنجیم که آیا
 * اون شخص با اون سن میتونه مشروبات الکلی خریداری کند یا نه
 * برای مثال افراد زیر ۱۸ سال و بالای ۶۰ سال نمیتونند مشروبات الکلی مصرف کنند
 *و فقط افراد بین سن ۱۸ تا ۶۰ سال میتونند
 * و ما برای این یک فانکشن نوشتیم با کمک ۳ تا دستور if و فانکشن 
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        //صدا زدن فانکشن و چاپ خروجی یا مقدار بازگشتی آن
        System.out.println(Wine_Seller(61));

    }
    public  static String Wine_Seller(int age){
        String Message = "";

        //برسی نمودن  شرط اول ۱ برای مقدار ورودی در فانکشن
        if (age<18)Message="You Cant not Buy One!";

        //برسی نمودن  شرط دوم۲ برای مقدار ورودی در فانکشن
        else if (age>60)Message="You Cant not Buy One!";

        //برسی نمودن  شرط سوم ۳ برای مقدار ورودی در فانکشن
        else if(age>=18)Message="You Can Buy One!";

        // و در آخر برگردوندن مقدار در متغیر Message
        return Message;
    }
}
