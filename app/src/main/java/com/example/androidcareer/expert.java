package com.example.androidcareer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class expert extends Activity {
    RecyclerView recyclerView;
    adapter adapter;
    ArrayList<String> item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp);

        Intent intent=getIntent();
        item =new ArrayList<>();
        item.add("NK");

        recyclerView=(RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new adapter(this,item);
        recyclerView.setAdapter(adapter);
    }
}