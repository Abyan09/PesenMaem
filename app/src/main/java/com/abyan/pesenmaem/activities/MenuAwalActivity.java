package com.abyan.pesenmaem.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.abyan.pesenmaem.R;
import com.abyan.pesenmaem.fragments.AboutFragment;

public class MenuAwalActivity extends AppCompatActivity{

//    private AboutFragment aboutFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_awal);
//        aboutFragment = AboutFragment.newInstance("Moch. Abyan An-nabhany");

    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return  true;
    }*/

/*    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // TODO: Tambahkan penanganan menu di sini
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, aboutFragment)
                .addToBackStack(null)
                .commit();
        return super.onOptionsItemSelected(item);
    }*/

    public void handlerClickMenuFragment(View view) {
        Intent intent = new Intent(this, LihatMenuActivity.class);
        startActivity(intent);
    }
    public void HandelerMenuPesan(View view) {
        Intent intent = new Intent(this, MenuPesanActivity.class);
        startActivity(intent);
    }
}
