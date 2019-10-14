package com.abyan.pesenmaem.activities;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.abyan.pesenmaem.R;
import com.abyan.pesenmaem.fragments.AboutFragment;

public class MainActivity extends AppCompatActivity{
    private AboutFragment aboutFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutFragment = AboutFragment.newInstance("Moch. Abyan An-nabhany");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return  true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // TODO: Tambahkan penanganan menu di sini

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout, aboutFragment)
                .addToBackStack(null)
                .commit();
        return super.onOptionsItemSelected(item);
    }
}
