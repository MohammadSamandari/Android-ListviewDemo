package com.mohammadsamandari.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mohammad");
        arrayList.add("Faeze");
        arrayList.add("Fazele");
        arrayList.add("Mostafa");

        //We can Create the arrayList in just one line like this:
//        ArrayList<String> arrayList1 = new ArrayList<>(asList("Mohammad", "Faeze", "Ali", "Majid"));

        ListView listView = findViewById(R.id.myListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Hello " + arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
