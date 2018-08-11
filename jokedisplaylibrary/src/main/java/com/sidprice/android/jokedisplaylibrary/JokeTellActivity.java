package com.sidprice.android.jokedisplaylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class JokeTellActivity extends AppCompatActivity {
    public static String JOKE_KEY = "joke_key" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_tell);
        Intent  intent = getIntent() ;
        String  joke = intent.getStringExtra(JOKE_KEY) ;
        if ( joke != null ) {
            Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No joke for you!", Toast.LENGTH_SHORT).show();
        }
    }
}
