package com.example.androidcareer;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void signin(View view) {
        setContentView(R.layout.sign);
    }
    public void signup(View view) {
        setContentView(R.layout.login_xml);
    }
    public void itr(View view) {
        setContentView(R.layout.blog);
    }
}
