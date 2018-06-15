package com.example.ravi.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ravi.views.views.CustomView;

public class MainActivity extends AppCompatActivity {


    private CustomView mcustomView;
    private Button mbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mcustomView=(CustomView)findViewById(R.id.customView);
        mbtn=(Button) findViewById(R.id.btn_swap_color);

        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mcustomView.swapColor();
            }
        });


    }
}
