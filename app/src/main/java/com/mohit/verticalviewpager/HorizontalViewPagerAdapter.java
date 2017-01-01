package com.mohit.verticalviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

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
