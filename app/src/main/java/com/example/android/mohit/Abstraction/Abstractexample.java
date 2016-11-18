package com.example.android.mohit.Abstraction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by android on 11/18/2016.
 */

public class Abstractexample extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
}

    public static void main(String args[]){
        Shape s=new Rectangle();
        s.draw();
    }
}