package com.example.sitimulacademi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int  sira=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView stimul = (TextView) findViewById(R.id.sitimul);
         TextView academy = findViewById(R.id.academy);
         String []name= new String[]{"I","T","I","M","U","L","C","A","D","E","M","Y"};

          stimul.setText("");
          academy.setText("");


       Intent intent  = new Intent(this , Sellect_random.class);


        new CountDownTimer(2700 , 150){
            @Override
            public void onTick(long l) {
                if(sira<6) {
                    stimul.setText(stimul.getText() + name[sira]);
                }else if(sira>5 & sira<12) {
                    academy.setText(academy.getText()+name[sira]);
                }
                sira++;
            }

            @Override
            public void onFinish() {
                startActivity(intent);
            }
        }.start();

    }

}




