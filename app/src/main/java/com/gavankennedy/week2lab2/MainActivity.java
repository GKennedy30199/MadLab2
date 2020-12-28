package com.gavankennedy.week2lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.CursorJoiner;
import android.graphics.Interpolator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText mWeightText;
private EditText mHeightText;
private EditText ResultText;
private TextView mResultText;
private Button mCalculate;
public static final String  Results_Num="ResultsOfMath";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(mWeightText.getText().toString().length()==0)
        {
            mWeightText.setText("0");
        }
        if (mHeightText.getText().toString().length()==0)
        {
            mHeightText.setText("0");
        }

        mWeightText=(EditText)findViewById(R.id.WeightNumber);
        mHeightText=(EditText)findViewById(R.id.HeightNumber);
        mCalculate=findViewById(R.id.Calculate);
        mResultText=findViewById(R.id.ResultText);

        mCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Weight=Integer.parseInt(mWeightText.getText().toString());
                int Height=Integer.parseInt(mHeightText.getText().toString());

                int Result=Weight/Height * Height;

                OpenResults();
            }
        });
    }
    public void OpenResults()
    {
        Intent intent=new Intent(this,ResultsPage.class);
        //intent.putExtra(Results_Num,)
        startActivity(intent);
    }
}