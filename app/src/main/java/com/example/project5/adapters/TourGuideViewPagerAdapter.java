package com.example.project5.adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.project5.R;
import com.example.project5.fragments.AttractionsFragment;
import com.example.project5.fragments.EventsFragment;
import com.example.project5.fragments.HotelsFragment;
import com.example.project5.fragments.RestaurantsFragment;

/**
 * The type Tour guide view pager adapter.
 */
public class TourGuideViewPagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    /**
     * Instantiates a new Tour guide view pager adapter.
     *
     * @param context the context
     * @param fm      the fm
     */
    public TourGuideViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.mContext = context;
    }

    // Get item depending of current position
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else if (position == 3) {
            return new EventsFragment();
        } else{
            return new AttractionsFragment();
        }
    }

    // Get page title depending of current position
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurants);
        } else if (position == 2) {
            return mContext.getString(R.string.hotels);
        } else if (position == 3) {
            return mContext.getString(R.string.events);
        } else{
            return mContext.getString(R.string.attractions);
        }
    }

    // Get number of items/fragments of view pager
    @Override
    public int getCount() {
        return 4;
    }
}
