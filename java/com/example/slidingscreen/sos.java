package com.example.slidingscreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class sos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);
    }

    public void police(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9130027200"));
        startActivity(i);
    }

    public void watchman(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9130027200"));
        startActivity(i);
    }

    public void medical(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9130027200"));
        startActivity(i);
    }

    public void fire(View view) {
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9130027200"));
        startActivity(i);
    }
}