package com.example.a10305_6.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    private Editable editText;
    private Button button;
    private RadioGroup radioGroup;
    private String strTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    strTemperature = editText.toString().trim();
                    if (strTemperature.equals("")){
                        Log.d("hatta","Have space in blank");}

                        else {
                        Log.d("hatta", "No space =" +strTemperature);

                        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                        startActivity(intent);
                    }
                }catch (Exception e){
            }

        }
    });
}
}
