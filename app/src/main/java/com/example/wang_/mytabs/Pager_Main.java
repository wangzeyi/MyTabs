package com.example.wang_.mytabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Pager_Main extends FragmentPagerAdapter{

    int tabCount;

    public Pager_Main(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){

            case 0:
                 Tab_Sports ts = new Tab_Sports();
                 return ts;
            case 1:
                 Tab_Weather tw = new Tab_Weather();
                 return tw;
            default:
                 return null;


        }
    }

    @Override
    public int getCount() {
        return this.tabCount;
    }
}
