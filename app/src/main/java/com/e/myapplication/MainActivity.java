package com.e.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends
        AppCompatActivity {
    TextView textView;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        new ShowText().display();
        int a = 10;


    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
