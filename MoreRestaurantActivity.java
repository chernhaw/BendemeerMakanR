package com.chernhaw.bendemeermakan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MoreRestaurantActivity extends AppCompatActivity {




        Button back;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_more_restaurant);

            back = findViewById(R.id.back);
            back.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            finish();
                        }
                    }
            );

    }
}