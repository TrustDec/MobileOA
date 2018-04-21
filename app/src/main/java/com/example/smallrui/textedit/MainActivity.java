package com.example.smallrui.textedit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton loginButton1;
    private Button loginButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton1 = findViewById(R.id.loginButton1);
        loginButton2 = findViewById(R.id.loginButton2);
        loginButton1.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View v){
                super.onClick(v);
                Toast.makeText(MainActivity.this,"ImageButton",Toast.LENGTH_LONG).show();
            }
        });
        loginButton2.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View v){
                super.onClick(v);
                Toast.makeText(MainActivity.this,"Button",Toast.LENGTH_LONG).show();
            }
        });
    }
}

class MyOnClickListener implements View.OnClickListener{
    @Override
    public void onClick(View v){
        Log.i("tag","aksjkjkjkjk");
        v.setAlpha(0.5f);
    }
}

