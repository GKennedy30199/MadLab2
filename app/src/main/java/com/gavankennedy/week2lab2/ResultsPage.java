package com.gavankennedy.week2lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.xml.transform.Result;

public class ResultsPage extends AppCompatActivity {
private TextView mResultText;
private Button mReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);

        mResultText=findViewById(R.id.ResultText);

        mReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                OpenMain();
            }
        });

    }
    public void OpenMain()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}