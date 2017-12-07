package com.example.operam.collegeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by operam on 12/4/2017.
 */

public class ProfileFragment extends Fragment {

    public View onCreateView(LayoutInflater p, ViewGroup q, Bundle r){
        View rootView = p.inflate(R.layout.fragment_profile, q, false);
        return rootView;

    }
}


