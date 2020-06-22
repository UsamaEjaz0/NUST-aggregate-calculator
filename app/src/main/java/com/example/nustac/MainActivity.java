package com.example.nustac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double matric,fsc,fsctotal,net;
    static double agg;
    EditText mm,fm,tm,nm;
    Button find;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mm=findViewById(R.id.mm);
        fm=findViewById(R.id.fm);
        tm=findViewById(R.id.tm);
        nm=findViewById(R.id.nm);
        find =findViewById(R.id.find);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    matric=Double.parseDouble(mm.getText().toString());
                    fsc=Double.parseDouble(fm.getText().toString());
                    fsctotal=Double.parseDouble(tm.getText().toString());
                    net=Double.parseDouble(nm.getText().toString());

                    agg=((matric/1100)*10)+((fsc/fsctotal)*15)+((net/200)*75);
                    Intent i = new Intent(MainActivity.this, Agg.class);
                    startActivity(i);}
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "Wrong inputs", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
