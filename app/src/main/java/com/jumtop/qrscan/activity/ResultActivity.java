package com.jumtop.qrscan.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.jumtop.qrscan.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity {

    @Bind(R.id.result_content)
    TextView mResultContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);
        setTitle("扫描结果");
        Bundle extras = getIntent().getExtras();
        mResultContent.setText(extras.getString("result"));
    }
}
