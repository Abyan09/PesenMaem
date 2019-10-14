package com.abyan.pesenmaem.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abyan.pesenmaem.R;
import com.abyan.pesenmaem.activities.LihatMenuActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuMakananFragment extends Fragment {

    public MenuMakananFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_makanan, container, false);
    }

}
