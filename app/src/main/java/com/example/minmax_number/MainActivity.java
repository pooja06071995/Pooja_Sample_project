package com.example.minmax_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout llFirst;
    private EditText edtFirstno;
    private LinearLayout llSecond;
    private EditText edtsecondno;
    private Button btnMaximumno;
    private Button btnMinimum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llFirst = (LinearLayout) findViewById(R.id.llFirst);
        edtFirstno = (EditText) findViewById(R.id.edtFirstno);
        llSecond = (LinearLayout) findViewById(R.id.llSecond);
        edtsecondno = (EditText) findViewById(R.id.edtsecondno);
        btnMaximumno = (Button) findViewById(R.id.btnMaximumno);
        btnMinimum = (Button) findViewById(R.id.btnMinimum);
        btnMaximumno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(edtFirstno.getText().toString()) > Integer.parseInt(edtsecondno.getText().toString())) {
                    Toast.makeText(MainActivity.this, edtFirstno.getText().toString()+"  No is greater", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, edtsecondno.getText().toString()+"  No is greater", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMinimum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(edtFirstno.getText().toString()) < Integer.parseInt(edtsecondno.getText().toString())) {
                    Toast.makeText(MainActivity.this, edtFirstno.getText().toString()+"  No is lesser", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, edtFirstno.getText().toString()+"  No is lesser", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
