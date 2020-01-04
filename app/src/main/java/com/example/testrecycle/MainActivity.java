package com.example.testrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView =(RecyclerView)findViewById(R.id.recyclev);

        RecycleViewAdapter adapter = new RecycleViewAdapter(this);


        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Bidex", "Daniel","Lang"));
        books.add(new Book("Bidex", "Daniel","Lang"));
        books.add(new Book("Bidex", "Daniel","Lang"));
    }
}
