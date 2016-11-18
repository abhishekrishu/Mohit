package com.example.android.mohit.overloading;

/**
 * Created by android on 11/18/2016.
 */

public class Sample extends example5 {


        public void disp(char c)
        {
            System.out.println(c);
        }
    public void disp(char c, int num)
    {
        System.out.println(c + " "+num);
    }
}
