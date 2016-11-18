package com.example.android.mohit.encapsulation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by android on 11/18/2016.
 */

public class encapexample extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        Student s=new Student();
        s.setName("vijay");
        System.out.println(s.getName());
    }
}