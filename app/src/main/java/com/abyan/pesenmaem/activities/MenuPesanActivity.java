package com.abyan.pesenmaem.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.abyan.pesenmaem.R;
import com.abyan.pesenmaem.fragments.MakananFragment;
import com.abyan.pesenmaem.fragments.MinumanFragment;

public class MenuPesanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pesan);
    }

    public void handlerClickMakananFragment(View view) {
        FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();

        MakananFragment makananFragment = (MakananFragment) getSupportFragmentManager().findFragmentByTag("MAKANAAN_FRAGMENT");
        if(makananFragment != null && makananFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new MakananFragment(), "MAKANAAN_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickMinumanFragment(View view) {
        FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();

        MinumanFragment minumanFragment = (MinumanFragment) getSupportFragmentManager().findFragmentByTag("MINUMAN_FRAGMENT");
        if(minumanFragment != null && minumanFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.enter_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new MinumanFragment(), "MINUMAN_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
