package com.abyan.pesenmaem.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.abyan.pesenmaem.R;
import com.abyan.pesenmaem.fragments.MenuMakananFragment;
import com.abyan.pesenmaem.fragments.MenuMinumanFragment;

public class LihatMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_menu);
    }

    public void handlerClickMakananFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        MenuMakananFragment makananFragment = (MenuMakananFragment) getSupportFragmentManager().findFragmentByTag("MAKANAAN_FRAGMENT");
        if (makananFragment != null && makananFragment.isVisible()) {
            fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.showmenu,new MenuMakananFragment(), "MENU_MAKANAN_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickMinumanFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        MenuMinumanFragment minumanFragment = (MenuMinumanFragment) getSupportFragmentManager().findFragmentByTag("MINUMAN_FRAGMENT");
        if (minumanFragment != null && minumanFragment.isVisible()) {
            fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.showmenu,new MenuMinumanFragment(), "MENU_MINUMAN_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickMenuAwalFragment(View view) {
        Intent intent = new Intent(this, MenuAwalActivity.class);
        startActivity(intent);
    }
}