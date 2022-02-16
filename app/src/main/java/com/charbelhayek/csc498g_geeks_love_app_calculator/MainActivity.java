package com.charbelhayek.csc498g_geeks_love_app_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String n;
    String language;
    Random random=new Random();




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner mySpinner=(Spinner) findViewById(R.id.spinner);//this is to find what we pick from the dropdown menu with the id spinner and save it to this variable
        ArrayAdapter<String> myAdapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.languages));
        //this array adapter is to be able to take everything we wrote in the strings.xml file like a dropdown to main activity from Layout what? the resources from the dropdown named languages
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);//this is to make it a dropdown
        mySpinner.setAdapter(myAdapter);//if we don't write this then all the data retreived and put in the adapter will not be shown in the spinner which is the main layout
        //this wil allow the adapter to show the dropdown
        mySpinner.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        language=adapterView.getItemAtPosition(i).toString();// the adapterView is the parent and i is the position

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void generate(View view)
    {
        TextView name=(TextView) findViewById(R.id.name);
        n=name.getText().toString();// where i will store the name as a String
        ImageView html=(ImageView)findViewById(R.id.html);
        ImageView css=(ImageView)findViewById(R.id.css);
        ImageView js=(ImageView)findViewById(R.id.js);
        ImageView java=(ImageView)findViewById(R.id.java);
        ImageView sql=(ImageView)findViewById(R.id.sql);
        ImageView react=(ImageView)findViewById(R.id.react);
        ImageView[] languages= {html,css,java,js,sql,react};//array of imageViews languages

           if(n.length()==0){
               Toast.makeText(this,"please enter your name to starte the game",Toast.LENGTH_LONG).show();
           }
          else {
               if (language.equalsIgnoreCase("html")) {
                   for (int i = 0; i < languages.length; i++)//this for loop is to make the opacity of any existing image to 0 before making a new one 1
                   {
                       ImageView lan = languages[i];
                       lan.animate().alpha(0).setDuration(2000);
                   }
                   html.animate().alpha(1).setDuration(2000);
                   int rndm = random.nextInt(101);//0 too 100
                   Toast.makeText(this, "your love to html is: " + rndm + "%", Toast.LENGTH_SHORT).show();
               } else if (language.equalsIgnoreCase("css")) {
                   for (int i = 0; i < languages.length; i++) {
                       ImageView lan = languages[i];
                       lan.animate().alpha(0).setDuration(2000);
                   }
                   css.animate().alpha(1).setDuration(2000);
                   int rndm = random.nextInt(101);//0 too 100
                   Toast.makeText(this, "your love to css is: " + rndm + "%", Toast.LENGTH_SHORT).show();
               } else if (language.equalsIgnoreCase("javascript")) {
                   for (int i = 0; i < languages.length; i++) {
                       ImageView lan = languages[i];
                       lan.animate().alpha(0).setDuration(2000);
                   }
                   js.animate().alpha(1).setDuration(2000);
                   int rndm = random.nextInt(101);//0 too 100
                   Toast.makeText(this, "your love to js is: " + rndm + "%", Toast.LENGTH_SHORT).show();
               } else if (language.equalsIgnoreCase("java")) {
                   for (int i = 0; i < languages.length; i++) {
                       ImageView lan = languages[i];
                       lan.animate().alpha(0).setDuration(2000);
                   }
                   java.animate().alpha(1).setDuration(2000);
                   int rndm = random.nextInt(101);//0 too 100
                   Toast.makeText(this, "your love to java is: " + rndm + "%", Toast.LENGTH_SHORT).show();
               } else if (language.equalsIgnoreCase("sql")) {
                   for (int i = 0; i < languages.length; i++) {
                       ImageView lan = languages[i];
                       lan.animate().alpha(0).setDuration(2000);
                   }
                   sql.animate().alpha(1).setDuration(2000);
                   int rndm = random.nextInt(101);//0 too 100
                   Toast.makeText(this, "your love to sql is: " + rndm + "%", Toast.LENGTH_SHORT).show();
               } else {
                   for (int i = 0; i < languages.length; i++) {
                       ImageView lan = languages[i];
                       lan.animate().alpha(0).setDuration(2000);
                   }
                   react.animate().alpha(1).setDuration(2000);
                   int rndm = random.nextInt(101);//0 too 100
                   Toast.makeText(this, "your love to react is: " + rndm + "%", Toast.LENGTH_SHORT).show();
               }
           }



    }
    public void table(View v){

    }

}