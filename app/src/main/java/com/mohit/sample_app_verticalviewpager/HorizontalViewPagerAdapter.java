package com.mohit.sample_app_verticalviewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * Created by mohit on 1/1/17.
 */

public class HorizontalViewPagerAdapter extends FragmentStatePagerAdapter{

    public String parentId;

    public void setParentID(String parentID){
        this.parentId = parentID;
    }

    public HorizontalViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        ChildFragment childFragment = new ChildFragment();
        Bundle bundle = new Bundle();
        bundle.putString("parent",parentId);
        bundle.putString("child",String.valueOf(position));
        childFragment.setArguments(bundle);
        return childFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
