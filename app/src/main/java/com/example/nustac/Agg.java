package com.example.nustac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Agg extends AppCompatActivity {
    TextView ag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agg);

        ag=findViewById(R.id.ag);
        ag.setText(""+ MainActivity.agg);
    }
}
