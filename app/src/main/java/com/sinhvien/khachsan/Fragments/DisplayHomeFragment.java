package com.sinhvien.khachsan.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.sinhvien.khachsan.Activities.HomeActivity;
import com.sinhvien.khachsan.R;

public class DisplayHomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.displayhome_layout,container,false);
        ((HomeActivity)getActivity()).getSupportActionBar().setTitle("Trang chủ");
        setHasOptionsMenu(true);

        return view;
    }
}

