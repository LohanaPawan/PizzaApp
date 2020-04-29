package com.fhad.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import java.util.*;

public class FinalScreen extends AppCompatActivity {

  //  Date currentTime = Calendar.getInstance().getTime();
    String size, type;
    int quantity, price;
    TextView finalQuantity, finalType, finalPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);

       Intent getIntent = getIntent();
        price = Integer.parseInt(getIntent.getStringExtra("price"));
       type = getIntent.getStringExtra("flavour");

        quantity = 10;

        finalQuantity = (TextView) findViewById(R.id.finalQuantity);
        finalType= (TextView)findViewById(R.id.finalType);
        finalPrice= (TextView) findViewById(R.id.finalPrice);

        finalQuantity.setText("Quantity: " + quantity);
        //finalSize.setText("Size: " + size);
        finalType.setText("Type: " + type);
        //finalPrice.setText("Price: " + price);
        //finalTime.setText("Time: " + currentTime);
    }
}
