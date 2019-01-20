package com.learncodeonline.lcoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView textViewForgot;
    Button btnLogin;
    ImageView imgGoogle, imgFacebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textViewForgot = (TextView) findViewById(R.id.userForgot);
        btnLogin = (Button) findViewById(R.id.userLogin);
        imgGoogle = (ImageView) findViewById(R.id.imageGoogle);
        imgFacebook = (ImageView) findViewById(R.id.imageFacebook);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Login",Toast.LENGTH_SHORT).show();
            }
        });

        textViewForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Forgot Password",Toast.LENGTH_SHORT).show();
            }
        });

        imgGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Google",Toast.LENGTH_SHORT).show();
            }
        });

        imgFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Facebook",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void clickArrow(View view)
    {
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
        finish();
    }


}
