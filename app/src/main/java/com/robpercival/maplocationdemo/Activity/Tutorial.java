package com.robpercival.maplocationdemo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.robpercival.maplocationdemo.PrefManager.PrefManager;
import com.robpercival.maplocationdemo.R;
import com.robpercival.maplocationdemo.Util.Constantes;

public class Tutorial extends AppCompatActivity {

    private ImageView btn_consulta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        getSupportActionBar().setTitle(Constantes.tutorial);

        btn_consulta = (ImageView) findViewById(R.id.btn_consulta);

        btn_consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Para ejecutar varias veces el walkthrough
                PrefManager prefManager = new PrefManager(getApplicationContext());

                // le da TRUE la primera vez que lo ejecuta
                prefManager.setFirstTimeLaunch(true);

                startActivity(new Intent(Tutorial.this, WelcomeActivity.class));
                finish();
            }
        });
    }
}
