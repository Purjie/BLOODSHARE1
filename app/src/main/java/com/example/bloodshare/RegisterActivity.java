package com.example.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {


    /*
    Purnama Adjie
    10116079
    IF-2
    CHANGE LOG MINGGU 14 APRIL 2019
      1. Membuat menu Login
      2. Membuat menu Register
      3. Membuat menu Almost_here
      4. Membuat menu Verify
      5. Membuat menu Home

    CHANGE LOG SENIN-KAMIS 15-18 APRIL 2019
            1. Membuat repository Latihan2 pada github
            2. Menyelsaikan masalah error pada gradle

    */
    Button btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //button
        btnRegis = (Button) findViewById(R.id.btn_regis);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,AlmostThereActivity.class);
                startActivity(intent);
            }
        });

    }
}
