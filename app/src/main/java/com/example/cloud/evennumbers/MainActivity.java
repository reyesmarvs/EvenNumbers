package com.example.cloud.evennumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView display;
    Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.textView3);

        showButton = (Button) findViewById(R.id.button1);
        showButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int totalCount = 10;
            int currentNum = 0;

            display.setText("Output here: \n");
            for(int x=1; currentNum<totalCount; x++){
                if(x % 2 == 0){
                    currentNum++;
                    display.append(x + " ");
                }
            }
        }
     });
    }
}
