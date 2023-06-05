package com.hajra.quranapp;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView SurahListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SurahListView= findViewById(R.id.listViewMain);


        QuranArabicText QAT = new QuranArabicText();
        QDH QDHObject = new QDH();
        String [] UrduSurahNames = QDHObject.urduSurahNames;

        ArrayList<String> QATArrayList= new ArrayList<String>();
        ArrayAdapter<String> arrayAdapter =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,QATArrayList);

        for (int i = 0; i < UrduSurahNames.length; i++) {
            QATArrayList.add(i+1 + "-\t\t\t\t" + QDHObject.englishSurahNames[i] );


        }

        SurahListView.setAdapter(arrayAdapter);

        SurahListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


    }
}