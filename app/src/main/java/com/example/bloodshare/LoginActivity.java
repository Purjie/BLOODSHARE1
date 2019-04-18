package com.example.bloodshare;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

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

    EditText edtUsername, edtPassword;
    Button btnLogin;
    TextView txtRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = (EditText) findViewById(R.id.username);
        edtPassword = (EditText) findViewById(R.id.passwordedit);
        btnLogin = (Button) findViewById(R.id.login);
        txtRegis = (TextView) findViewById(R.id.txt_register);

        String txtregis = "doesn't have account ? Register";

        SpannableString ss = new SpannableString(txtregis);

        StyleSpan txtBold = new StyleSpan(Typeface.BOLD);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };

        ss.setSpan(clickableSpan1, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(txtBold, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtRegis.setText(ss);
        txtRegis.setMovementMethod(LinkMovementMethod.getInstance());
    }
}