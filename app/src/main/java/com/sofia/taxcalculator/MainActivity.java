package com.sofia.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txt;
    private Button btn;
    private TextView output;
    private float sal,tax,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        txt=findViewById(R.id.salary);
        btn=findViewById(R.id.butn);
        output=findViewById(R.id.res);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sal=Float.parseFloat(txt.getText().toString());
                year=sal*12;
                if(year<=200000 && year>1){
                    tax=(year*1)/100;
                    output.setText(""+tax);
                }else if(year>200000 && year<=350000){
                    tax=((year-200000)*15/100)+2000;
                    output.setText(""+tax);

                }else if(year>350000){
                    tax=(((year-200000-150000)*25)/100)+2000+22500;
                    output.setText(""+tax);
                }
            }
        });
    }
}
