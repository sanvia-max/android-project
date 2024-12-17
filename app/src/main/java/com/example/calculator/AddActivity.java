package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity
{
    Button b1,b2;
    String getNum1,getNum2,result;
    EditText e1,e2;
    Integer n1,n2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        e1=(EditText) findViewById(R.id.numb1);
        e2=(EditText) findViewById(R.id.numb2);
        b1=(Button) findViewById(R.id.add);
        b2=(Button) findViewById(R.id.log1);


        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ob=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob);
            }
        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                getNum1=e1.getText().toString();
                getNum2=e2.getText().toString();
                n1=Integer.parseInt(getNum1);
                n2=Integer.parseInt(getNum2);
                sum=n1+n2;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }
        });

    }
}