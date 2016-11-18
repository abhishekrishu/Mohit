package com.example.android.mohit.inheritance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by android on 11/18/2016.
 */

public class inheritexample extends AppCompatActivity
{

    public void onCreate(Bundle savedInstanceState) {

            example2.Animal animal = new example2.Animal() {

                public void sleep() {

                }


                public void eat() {

                }
            };

            example2.Bird bird = new example2.Bird() {

                public void sleep() {

                }


                public void eat() {

                }
            };

            example2.Cow cow = new example2.Cow() {

                public void sleep() {

                }


                public void eat() {

                }
            };



            System.out.println();



            animal.sleep();

            animal.eat();



            bird.sleep();

            bird.eat();



            cow.sleep();

            cow.eat();

        }

    }

