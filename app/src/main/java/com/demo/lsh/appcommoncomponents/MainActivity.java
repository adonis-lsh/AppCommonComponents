package com.demo.lsh.appcommoncomponents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lsh.toolcomponentslibrary.ToolComponentsUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ToolComponentsUtils.getInstance()
                .authorizationAndShareActivityResult(this,requestCode,resultCode,data);
    }
}
