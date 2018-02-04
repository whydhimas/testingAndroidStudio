package com.example.yosafatdhimas.kuissederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void yes_answer(View view) {
        TextView tv = (TextView)findViewById(R.id.show_text);
        tv.setText("YAK 100 JUTA RUPIAH BELUM TERMASUK PAJAK HAHAHAHHAHAHAA");
    }

    public void no_answer(View view) {
        TextView tv = (TextView)findViewById(R.id.show_text);
        tv.setText(":(((");
    }
}
