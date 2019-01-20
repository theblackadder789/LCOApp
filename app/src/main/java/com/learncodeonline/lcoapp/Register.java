package com.learncodeonline.lcoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    Button userSignUp;
    ImageView imgGoogle, imgFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userSignUp = (Button) findViewById(R.id.userSignup);
        imgGoogle = (ImageView) findViewById(R.id.imageGoogle);
        imgFacebook = (ImageView) findViewById(R.id.imageFacebook);

        userSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"Sign Up", Toast.LENGTH_SHORT).show();
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
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_down);
        finish();
    }

    public void finish()
    {
        super.finish();
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_down);
    }
}
