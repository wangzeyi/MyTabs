package com.example.wang_.mytabs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab_Sports extends Fragment implements TabLayout.BaseOnTabSelectedListener {

    Toolbar toolBar_Sports;
    TabLayout tablayout_Sports;
    ViewPager pager_Sports;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.tab_sports, container, false);

        toolBar_Sports = v.findViewById(R.id.toolbar_sports);
        tablayout_Sports = v.findViewById(R.id.tablayout_sports);
        pager_Sports = v.findViewById(R.id.pager_sports);

        //v.setSupportActionBar(toolBar_Sports);

        tablayout_Sports.addTab(tablayout_Sports.newTab().setText("Soccer"));
        tablayout_Sports.addTab(tablayout_Sports.newTab().setText("Basketball"));
        tablayout_Sports.setTabGravity(TabLayout.GRAVITY_FILL);
        tablayout_Sports.addOnTabSelectedListener(this);

        Pager_Sports p_sports = new Pager_Sports(getFragmentManager(),tablayout_Sports.getTabCount());

        pager_Sports.setAdapter(p_sports);

        pager_Sports.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

                tablayout_Sports.setScrollPosition(i, 0 ,true);
                tablayout_Sports.setSelected(true);
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


        return v;
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        pager_Sports.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
