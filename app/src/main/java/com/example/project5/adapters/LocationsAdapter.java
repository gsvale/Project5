package com.example.project5.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.project5.R;
import com.example.project5.objects.Location;

import java.util.ArrayList;

public class LocationsAdapter extends ArrayAdapter<Location> {

    private Context mContext;
    private int mColorResource;


    public LocationsAdapter(Context context, ArrayList<Location> values, int colorResource) {
        super(context, 0, values);
        this.mContext = context;
        this.mColorResource = colorResource;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final Location locationItem = getItem(position);

        View viewItem = convertView;
        if (viewItem == null) {
            viewItem = LayoutInflater.from(getContext()).inflate(R.layout.location_list_item, parent, false);
        }

        // Get LinearLayout object to fill with background color
        LinearLayout locationInfoLl = viewItem.findViewById(R.id.location_info_ll_id);
        locationInfoLl.setBackgroundColor(mContext.getResources().getColor(mColorResource));

        // Fill ImageView and TextViews objects
        ImageView locationIconIv = viewItem.findViewById(R.id.location_icon_iv_id);
        TextView locationNameTv = viewItem.findViewById(R.id.location_name_tv_id);
        TextView locationOpeningTimeTv = viewItem.findViewById(R.id.location_opening_time_tv_id);

        // Check if Location object has image and shows it or else it hides ImageView
        if(locationItem != null && locationItem.hasImage()){
            locationIconIv.setImageResource(locationItem.getImageResourceId());
            locationIconIv.setVisibility(View.VISIBLE);
        }
        else{
            locationIconIv.setVisibility(View.GONE);
        }

        // Fill name and location TextViews with the Location object values
        locationNameTv.setText(locationItem != null ? locationItem.getName() : null);
        locationOpeningTimeTv.setText(locationItem != null ? locationItem.getOpeningTime() : null);


        return viewItem;
    }


}
