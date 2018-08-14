package com.sidprice.android.jokedisplaylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokeTellActivity extends AppCompatActivity {
    public static String JOKE_KEY = "joke_key" ;
    private TextView    mTextView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_tell);
        mTextView = findViewById(R.id.joke_tv) ;
        Intent  intent = getIntent() ;
        String  joke = intent.getStringExtra(JOKE_KEY) ;
        if ( joke != null && !joke.equals("")) {
            mTextView.setText(joke);
        } else {
            Toast.makeText(this, "Unable to contact the joke provider\nPlease try again later", Toast.LENGTH_LONG).show();
        }
    }
}
