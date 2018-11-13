package com.example.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class denuevok extends AppCompatActivity {

    Button posty;
    Button lilpeep;
    Button xxxtent;
    Button stanlee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denuevok);

        //// boton de posty////

        posty = (Button)findViewById(R.id.postybtn);

        posty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent posty = new Intent(denuevok.this, denuevok2.class);
                startActivity(posty);
            }
        });

        //////boton de lil peep////

        lilpeep = (Button)findViewById(R.id.lilpeepbtn);

        lilpeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lilpeep = new Intent( denuevok.this, denuevok3.class);
                startActivity(lilpeep);
            }
        });

        /////boton xxxtentacion ////

        xxxtent = (Button)findViewById(R.id.xxxbtn);

        xxxtent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent xxxtent = new Intent(denuevok.this, denuevok4.class);
                startActivity(xxxtent);
            }
        });

        /////boton stan lee/////

        stanlee = (Button)findViewById(R.id.stanleebtn);

        stanlee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stanlee = new Intent(denuevok.this, denuevok5.class);
                startActivity(stanlee);
            }
        });




    }
}
