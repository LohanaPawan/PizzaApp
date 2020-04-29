package com.fhad.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class OrderDetails extends AppCompatActivity {



    String flavour;
    Button backBtn, confirmBtn;
    String doughType, sizeType;
    Spinner sp1,sp2;
    int price, quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        Intent getIntent = getIntent();
        flavour = getIntent.getStringExtra("flavour");
       System.out.println(flavour);
        backBtn = (Button) findViewById(R.id.backBtn);
        confirmBtn = (Button) findViewById(R.id.confirmBtn);
        sp1 = (Spinner) findViewById(R.id.dough);
        sp2 = (Spinner) findViewById(R.id.Size);

        doughType = String.valueOf(sp1.getSelectedItem());
        sizeType = String.valueOf(sp2.getSelectedItem());

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderDetails.this, Flavours.class);
                startActivity(intent);
            }
        });

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flavour.equals("Tikka Pizza")){
                    price += 200;
                }else if(flavour.equals("Chicken Pizza"))
                {
                    price+=300;
                }
                else if(flavour.equals("Handi Pizza"))
                {
                    price+=400;
                }
                else if(flavour.equals("Special Pizza"))
                {
                    price+=500;
                }


                System.out.println("flavour" + flavour);
            Intent intent = new Intent(OrderDetails.this, FinalScreen.class);
             intent.putExtra("price", price);

             startActivity(intent);
            }
        });



    }
}
