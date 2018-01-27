package com.example.miguel.teste;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Perfil2Activity extends AppCompatActivity {

    private LinearLayout bottomsheetlayout;
    private BottomSheetBehavior bottomSheetBehavior;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil2);

        //Chamando os Metodos
        metodoShare();

    }






    private void metodoShare () {
        bottomsheetlayout = (LinearLayout) findViewById(R.id.buttonsheet);
        imageView = (ImageView) findViewById(R.id.shareimg);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheetlayout);

        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Outras Formas
              //  bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
               // bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);


                // Show Bottom Sheet
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
    }
}
