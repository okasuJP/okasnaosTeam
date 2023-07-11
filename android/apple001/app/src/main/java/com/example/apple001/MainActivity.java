package com.example.apple001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton(View view){
        //体重の取得
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);

        //Edit→String
        String strNumber = editTextNumber.getText().toString();

        //数値に変換
        int intNumber = Integer.parseInt(strNumber);

        //計算
        int ringoNumber = (intNumber * 1000) / 350;

        ((TextView)findViewById(R.id.textView3)).setText("あなたは" + ringoNumber + "個分のりんごです！");

    }
}