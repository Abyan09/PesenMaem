package com.abyan.pesenmaem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.abyan.pesenmaem.activities.MenuAwalActivity;
import com.abyan.pesenmaem.fragments.AboutFragment;

public class MainActivity extends AppCompatActivity {

    private AboutFragment aboutFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutFragment = AboutFragment.newInstance("Moch. Abyan An-Nambhany");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, aboutFragment)
                .addToBackStack(null)
                .commit();


    }

    public void handlerClickMenuAwalFragment(View view) {
        Intent intent = new Intent(this, MenuAwalActivity.class);
        startActivity(intent);
    }
}
