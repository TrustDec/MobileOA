package com.example.smallrui.textedit;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
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
    private static final int OVERLAY_PERMISSION_REQ_CODE = 1212;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        findViewById(R.id.tv_react_native).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, MyReactActivity.class);
//                startActivity(intent);
//            }
//        });
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (!Settings.canDrawOverlays(this)) {
//                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
//                        Uri.parse("package:" + getPackageName()));
//                startActivityForResult(intent, OVERLAY_PERMISSION_REQ_CODE);
//            }
//        }
//        setContentView(R.layout.activity_main);
//        loginButton1 = findViewById(R.id.loginButton1);
//        loginButton2 = findViewById(R.id.loginButton2);
//        loginButton1.setOnClickListener(new MyOnClickListener(){
//            @Override
//            public void onClick(View v){
//                super.onClick(v);
//                Toast.makeText(MainActivity.this,"ImageButton",Toast.LENGTH_LONG).show();
//            }
//        });
//        loginButton2.setOnClickListener(new MyOnClickListener(){
//            @Override
//            public void onClick(View v){
//                super.onClick(v);
//                Toast.makeText(MainActivity.this,"Button",Toast.LENGTH_LONG).show();
//            }
//        });
        Intent intent = new Intent(this, MyReactActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == OVERLAY_PERMISSION_REQ_CODE) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (!Settings.canDrawOverlays(this)) {
                    Toast.makeText(this, "You cannot open the React Native app as you have denied the permission", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}

class MyOnClickListener implements View.OnClickListener{
    @Override
    public void onClick(View v){
        Log.i("tag","aksjkjkjkjk");
        v.setAlpha(0.5f);
    }
}

