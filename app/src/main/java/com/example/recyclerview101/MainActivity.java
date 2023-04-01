package com.example.recyclerview101;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
   public List<String>hobbies;
    DividerItemDecoration dividerItemDecoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.view);

        hobbies=new ArrayList<>();

        dividerItemDecoration=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);


        recyclerAdapter=new RecyclerAdapter(hobbies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.addItemDecoration(dividerItemDecoration);

        hobbies.add("Chess");
        hobbies.add("Football");
        hobbies.add("Gambling");
        hobbies.add("Swimming");
        hobbies.add("Working out");
        hobbies.add("Karate");
        hobbies.add("Pool");
        hobbies.add("Travelling");
        hobbies.add("Electronics");
        hobbies.add("Video games");
        hobbies.add("Ted talks");



    }
}