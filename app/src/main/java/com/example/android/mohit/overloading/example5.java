package com.example.android.mohit.overloading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by android on 11/18/2016.
 */

public class example5 extends AppCompatActivity{
    public void onCreate(Bundle savedInstanceState) {

  DisplayOverloading obj = new DisplayOverloading() {
      @Override
      public void disp(char a, int i) {

      }
  };
        obj.disp('a',20);
        obj.disp('a',10);
    }
}