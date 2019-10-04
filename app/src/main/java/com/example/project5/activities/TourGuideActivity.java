package com.example.project5.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.project5.R;
import com.example.project5.adapters.TourGuideViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

/**
 * The type Tour guide activity.
 */
public class TourGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ViewPager variable
        ViewPager viewPager = findViewById(R.id.view_pager_id);

        // ViewPagerAdapter variable
        TourGuideViewPagerAdapter viewPagerAdapter = new TourGuideViewPagerAdapter(this, getSupportFragmentManager());

        // Set adapter in viewPager variable
        viewPager.setAdapter(viewPagerAdapter);

        // Get TabLayout variable and setup with viewPager variable
        TabLayout tabLayout = findViewById(R.id.tab_layout_id);
        tabLayout.setupWithViewPager(viewPager);
    }
}
