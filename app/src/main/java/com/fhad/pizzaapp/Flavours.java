package com.fhad.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flavours extends AppCompatActivity {

    View tikkaBtn;
    Button backBtn;
    String flavour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavours);
        Intent getIntent = getIntent();

        tikkaBtn = (View) findViewById(R.id.tpBtn);
        backBtn = (Button) findViewById(R.id.flavourBack);

        tikkaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flavour = "Tikka Pizza";
                Intent intent = new Intent(Flavours.this, OrderDetails.class);
                intent.putExtra("flavour", flavour);

                startActivity(intent);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Flavours.this, MainActivity.class);

                startActivity(intent);
            }
        });

    }


}
