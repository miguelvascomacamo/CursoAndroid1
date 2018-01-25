package com.example.miguel.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1, btprogress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // chamando os methods

        secondAcrivity();
        callingThirdActivity();
    }



    private void secondAcrivity () {
        bt1 = (Button) findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent meuIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(meuIntent);
                Toast.makeText(getApplicationContext(), "Este eh o meu programa em android", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void callingThirdActivity () {
       btprogress = (Button) findViewById(R.id.btnprogress);

       btprogress.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent progress = new Intent(MainActivity.this, ThirdActivity.class);
               startActivity(progress);
           }
       });

    }
}
