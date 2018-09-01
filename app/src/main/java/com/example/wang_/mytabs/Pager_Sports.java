package com.example.wang_.mytabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Pager_Sports extends FragmentPagerAdapter{

    int tabCount;


    public Pager_Sports(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;

    }

    @Override
    public Fragment getItem(int i) {
        switch (i){

            case 0:
                Tab_Soccer ts = new Tab_Soccer();
                return ts;
            case 1:
                Tab_Basketball tb = new Tab_Basketball();
                return tb;
            default:
                return null;


        }
    }

    @Override
    public int getCount() {
        return this.tabCount;
    }
}
