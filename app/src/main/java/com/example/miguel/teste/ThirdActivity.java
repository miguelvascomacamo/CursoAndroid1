package com.example.miguel.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class ThirdActivity extends AppCompatActivity {

    ProgressBar progressbar;
    SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }


    private void progressbar () {

        progressbar = (ProgressBar) findViewById(R.id.progressBar2);
        seekbar = (SeekBar) findViewById(R.id.seekBar2);

        seekbar.setMax(100);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
              progressbar.setProgress(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}
