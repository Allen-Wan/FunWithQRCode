package com.jumtop.qrscan.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jumtop.qrscan.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_scan).setOnClickListener(this);
        findViewById(R.id.btn_decode).setOnClickListener(this);
        findViewById(R.id.btn_generate).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_scan:
                startActivity(new Intent(this, ScanActivity.class));
                break;
            case R.id.btn_decode:
                startActivity(new Intent(this, DecodeActivity.class));
                break;
            case R.id.btn_generate:
                startActivity(new Intent(this, GenerateActivity.class));
                break;
        }
    }
}
