package com.lht.demo.zxingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lht.demo.zxingdemo.com.google.zxing.client.android.CaptureActivity;

public class MainActivity extends AppCompatActivity {


    private Button bt;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in = new Intent(MainActivity.this, CaptureActivity.class);
                startActivity(in);
            }
        });


    }
}
