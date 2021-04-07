package com.example.myassignmentmobilecompuing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent intent1,intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  mybutton1,mybutton2;
        mybutton1=findViewById(R.id.english);
        mybutton2=findViewById(R.id.poems);


    }

    public void Englishletters(View view) {
        intent1=new Intent(this,Englishletters.class);
        startActivity(intent1);
    }

    public void englishpoems(View view) {
        intent2=new Intent(this,englishpoems.class);
        startActivity(intent2);

    }
}