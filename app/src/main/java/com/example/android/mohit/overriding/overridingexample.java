package com.example.android.mohit.overriding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by android on 11/18/2016.
 */

public class overridingexample extends AppCompatActivity {
    public Object args;

    public void onCreate(Bundle savedInstanceState) {



           {
                SBI s = new SBI();

                AXIS a = new AXIS();

                PNB uu = new PNB();

                System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());

                System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());

                System.out.println("PNB Rate of Interest: " + uu.getRateOfInterest());

            }
        }
    }

