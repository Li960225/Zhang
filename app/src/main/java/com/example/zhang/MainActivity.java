package com.example.zhang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	//张鹏一天能产4斤奶
        //王胜利love未成年？
        initView();
    }

    private void initView() {
        View iv = findViewById(R.id.tv);
    }
}