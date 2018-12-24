package com.whatsapp.magazine.paulooliveira.usaralcoolougasolina.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whatsapp.magazine.paulooliveira.usaralcoolougasolina.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GasolinaFragment extends Fragment {


    public GasolinaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gasolina, container, false);
    }

}
