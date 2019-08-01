package com.mohit.sample_app_verticalviewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ChildFragment extends Fragment {
    public TextView tvParent,tvChild;

    public ChildFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_child, container, false);
        // Inflate the layout for this fragment
        tvParent = (TextView) view.findViewById(R.id.tvParent);
        tvChild = (TextView) view.findViewById(R.id.tvChild);
        Bundle bundle = getArguments();
        tvParent.setText("Parent: " + bundle.getString("parent"));
        tvChild.setText("Child: " + bundle.getString("child"));

        return view;
    }

  }
