package com.example.addmore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ArrayList<Pojo> arrayList;
    RecyclerView recycler;
    String number="0";

    RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recycler=findViewById(R.id.recycler);
        recycler.setLayoutManager(new GridLayoutManager(SecondActivity.this,1));
        if (getIntent()!=null && getIntent().getStringExtra("number")!=null){
            number=getIntent().getStringExtra("number");
        }
        arrayList = new ArrayList<>();

        for (int i=0; i<Integer.parseInt(number);i++){
            Pojo pojo=new Pojo();
            pojo.setValue("");
            arrayList.add(pojo);
        }
        adapter = new RecyclerAdapter(SecondActivity.this,arrayList);
        recycler.setAdapter(adapter);
    }
}