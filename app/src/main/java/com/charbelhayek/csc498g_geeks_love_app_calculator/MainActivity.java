package com.charbelhayek.csc498g_geeks_love_app_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner mySpinner=(Spinner) findViewById(R.id.spinner);//this is to find what we pick from the dropdown menu with the id spinner and save it to this variable
        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.languages));
        //this array adapter is to be able to take everything we wrote in the strings.xml file like a dropdown to main activity from Layout what? the resources from the dropdown named languages
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);//this is to make it a dropdown
        mySpinner.setAdapter(myAdapter);//if we don't write this then all the data retreived and put in the adapter will not be shown in the spinner which is the main layout
        //this wil allow the adapter to show the dropdown
    }
    public void generate(View view)
    {

    }
}