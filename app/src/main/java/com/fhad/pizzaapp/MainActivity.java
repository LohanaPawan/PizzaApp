package com.fhad.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String shop= "";
    String message = "Pizza Shop";
    View tariq, gulshan, clifton, nazimabad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tariq= (View) findViewById(R.id.tariqBtn);
        gulshan= (View) findViewById(R.id.gulshanBtn);
        gulshan= (View) findViewById(R.id.gulshanBtn);
        clifton= (View) findViewById(R.id.cliftonBtn);
        nazimabad= (View) findViewById(R.id.nazimabadBtn);



        tariq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 shop = "Tariq Road";
                Intent intent = new Intent(MainActivity.this, Flavours.class);
                intent.putExtra("shop", shop);

                startActivity(intent);
            }
        });

        clifton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Branch is not operating at this time", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
