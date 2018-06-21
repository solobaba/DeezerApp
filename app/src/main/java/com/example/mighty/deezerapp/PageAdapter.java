package com.example.mighty.deezerapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter{

    private int numOfTabs;

    public PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new MyMusicFragment();
            case 2:
                return new FlowFragment();
            case 3:
                return new SearchFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
