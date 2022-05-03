package com.example.a51c;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportFragmentManager().beginTransaction().add(R.id.fragmentFrameLayout, new BlankFragment()).commit();
        content = findViewById(R.id.constraintLayout2);
    }

    @Override
    public void onClick(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFrameLayout, new BlankFragment()).commit();
        content.setVisibility(view.GONE);
    }
}