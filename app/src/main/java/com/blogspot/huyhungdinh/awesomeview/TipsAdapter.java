package com.blogspot.huyhungdinh.awesomeview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TipsAdapter extends FragmentStatePagerAdapter {

    public TipsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new TipsFragment();
                break;
            case 1:
                fragment = new TipsFragment();
                break;
            case 2:
                fragment = new TipsFragment();
                break;
            case 3:
                fragment = new TipsFragment();
                break;
            case 4:
                fragment = new TipsFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}