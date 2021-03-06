package com.example.tablayoutsimpledesign;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PageAdapterTabLayout extends FragmentPagerAdapter {
    int tabCount;
    public PageAdapterTabLayout(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new ftab1();
            case 1: return new ftab2();
            case 2: return new ftab3();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}

