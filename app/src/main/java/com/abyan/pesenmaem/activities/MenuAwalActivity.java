package com.abyan.pesenmaem.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.abyan.pesenmaem.MainActivity;
import com.abyan.pesenmaem.R;

public class MenuAwalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);
    }

    public void handlerClickMenuFragment(View view) {
        Intent intent = new Intent(this, LihatMenuActivity.class);
        startActivity(intent);
    }

    public void handlerClickHomeFragment(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
