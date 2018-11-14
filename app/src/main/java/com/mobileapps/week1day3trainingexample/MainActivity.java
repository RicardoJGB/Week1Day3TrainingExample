package com.mobileapps.week1day3trainingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mobileapps.week1day3trainingexample.model.Animal;
import com.mobileapps.week1day3trainingexample.model.Eagle;

public class MainActivity extends AppCompatActivity {

    TextView tvHelloMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHelloMessage = findViewById(R.id.hello_message);

        Animal animal = new Animal();
        animal.getName();

        Eagle eagle = new Eagle ("Bob",100000);
        eagle.flyDown();  //This was inherited from the "Bird" class, since we extended it to Eagle

        tvHelloMessage.setText(eagle.getName());
    }
}
