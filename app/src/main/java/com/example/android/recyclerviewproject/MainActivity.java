package com.example.android.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private List<Students> studentsList;
    private Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                                                                //IF THESE TWO COME AFTER HARDCODED LIST, no need to notify
        recyclerView = findViewById(R.id.recycler_view_example);
        studentsList = new ArrayList<>();

        setupList();

    }

    private void setupList() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        adapter = new Adapter(studentsList);                     //THIS INITIALIZES THE ARRAYLIST

        recyclerView.setAdapter(adapter);                       //TELLS RV WHERE ADAPTER IS
        recyclerView.setLayoutManager(linearLayoutManager);     //TELLS RV ABOUT ITS LAYOUT

        Students student = new Students("Crystal", "31", "Note 8", "YAY");
        Students student1 = new Students("Tina", "54", "iPhone SE", "Super Awesome!");
        Students student2 = new Students("Steph", "44", "S7 Edge", "YAYAYAYAYAYAY");

        studentsList.add(student);
        studentsList.add(student1);
        studentsList.add(student2);

        adapter.notifyDataSetChanged();
    }
}
