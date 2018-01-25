package com.example.miguel.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SecondActivity extends AppCompatActivity {

    ToggleButton tg;
    TextView textView;
    EditText editText;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ChangeText();
        ToastMessage();

    }

    
    private void ToastMessage () {

        // Creatting On OFf
        tg = (ToggleButton) findViewById(R.id.toggleButton);

        tg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isCheked) {
                if (isCheked) {
                    Toast.makeText(SecondActivity.this, "ON", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(SecondActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    private void ChangeText () {
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String etString = editText.getText().toString();
                textView.setText(etString);
            }
        });

    }
}
