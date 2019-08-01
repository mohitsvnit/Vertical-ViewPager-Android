package com.mohit.sample_app_verticalviewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * Created by mohit on 28/12/16.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Fragment getItem(int position) {
        ContentFragment contentFragment = new ContentFragment();
        Bundle bundle = new Bundle();
        bundle.putString("parent",String.valueOf(position));
        contentFragment.setArguments(bundle);
        return contentFragment;
    }
}
