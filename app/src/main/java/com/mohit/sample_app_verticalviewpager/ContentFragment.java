package com.mohit.sample_app_verticalviewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ContentFragment extends Fragment {

    public HorizontalViewPager viewPager;
    public HorizontalViewPagerAdapter horizontalViewPagerAdapter;
    public String parentInd;

    public ContentFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);

        parentInd=getArguments().getString("parent");

        viewPager = (HorizontalViewPager) view.findViewById(R.id.vpHorizontal);
        horizontalViewPagerAdapter = new HorizontalViewPagerAdapter(getChildFragmentManager());
        horizontalViewPagerAdapter.setParentID(parentInd);
        viewPager.setAdapter(horizontalViewPagerAdapter);
        Helper.log("Card Created : " + parentInd);
        viewPager.setCurrentItem(1);
        return view;
    }

}
