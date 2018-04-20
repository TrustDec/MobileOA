package com.example.smallrui.textedit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast toase;
                toase = Toast.makeText(MainActivity.this,"确定提交",Toast.LENGTH_LONG);
                toase.setGravity(20,20,20);
                toase.show();
            }
        });
    }
}
