package com.example.project5.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.project5.R;
import com.example.project5.adapters.LocationsAdapter;
import com.example.project5.objects.Location;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_locations_list, container, false);

        ListView locationsListView = rootView.findViewById(R.id.list_view_id);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.hotel_1_name), getString(R.string.hotel_1_opening_time), R.drawable.ic_zero_box_lodge));
        locations.add(new Location(getString(R.string.hotel_2_name), getString(R.string.hotel_2_opening_time), R.drawable.ic_eurostars_oporto_center));
        locations.add(new Location(getString(R.string.hotel_3_name), getString(R.string.hotel_3_opening_time), R.drawable.ic_torel_avantgarde));

        // Create CustomAdapter and pass the context of activity with getActivity(), the arraylist of locations, and a specific color resource
        LocationsAdapter adapter = new LocationsAdapter(getActivity(), locations, R.color.colorYellow);

        locationsListView.setAdapter(adapter);

        return rootView;
    }

}
