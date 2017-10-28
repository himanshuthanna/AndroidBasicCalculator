package com.example.lenovo.calculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calci();
    }


    EditText et1,et2;
    TextView t1;
    Button badd,bsub,bmul,bdiv;
    void calci(){
        badd=(Button)findViewById(R.id.add);
        bsub=(Button)findViewById(R.id.sub1);
        bmul=(Button)findViewById(R.id.mul);
        bdiv=(Button)findViewById(R.id.div);
        et1=(EditText)findViewById(R.id.name);
        et2=(EditText)findViewById(R.id.Age);
        t1=(TextView)findViewById(R.id.result);

        badd.setOnClickListener(this);
        bsub.setOnClickListener(this);
        bmul.setOnClickListener(this);
        bdiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String ed1 = et1.getText().toString();
        String ed2 = et2.getText().toString();
        switch (view.getId()) {
            case R.id.add:
                int add2 = Integer.parseInt(ed1) + Integer.parseInt(ed2);
                t1.setText(String.valueOf(ed1) + "+" + String.valueOf(ed2) + "=" + String.valueOf(add2));
                break;
            case R.id.sub1:
                int sub2 = Integer.parseInt(ed1) - Integer.parseInt(ed2);
                t1.setText(String.valueOf(ed1) + "-" + String.valueOf(ed2) + "=" + String.valueOf(sub2));
                break;
            case R.id.mul:
                int mul2 = Integer.parseInt(ed1) * Integer.parseInt(ed2);
                t1.setText(String.valueOf(ed1) + "*" + String.valueOf(ed2) + "=" + String.valueOf(mul2));
                break;
            case R.id.div:
                int div2 = Integer.parseInt(ed1) / Integer.parseInt(ed2);
                t1.setText(String.valueOf(ed1) + "/" + String.valueOf(ed2) + "=" + String.valueOf(div2));
                break;
        }
    }




}
