package com.example.wang_.mytabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity implements TabLayout.BaseOnTabSelectedListener {

    Toolbar toolBar;
    TabLayout tablayout_Main;
    ViewPager pager_Main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar = findViewById(R.id.toolbar);
        tablayout_Main = findViewById(R.id.tablayout_main);
        pager_Main = findViewById(R.id.pager_main);

        setSupportActionBar(toolBar);

        tablayout_Main.addTab(tablayout_Main.newTab().setText("Sports"));
        tablayout_Main.addTab(tablayout_Main.newTab().setText("Weather"));
        tablayout_Main.setTabGravity(TabLayout.GRAVITY_FILL);

        tablayout_Main.addOnTabSelectedListener(this);

        Pager_Main p_main = new Pager_Main(getSupportFragmentManager(), tablayout_Main.getTabCount());

        pager_Main.setAdapter(p_main);

        pager_Main.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

                tablayout_Main.setScrollPosition(i, 0 ,true);
                tablayout_Main.setSelected(true);
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {
       pager_Main.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
