package com.example.switchingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity2();
            }


        });



}

    private void activity2() {
        Intent intent = new Intent(this,secondscreen.class);
        startActivity(intent);
    }



    public void activity4(View view) {
        Intent intent2 = new Intent(this,thirdscreen.class);
        startActivity(intent2);
    }
    }