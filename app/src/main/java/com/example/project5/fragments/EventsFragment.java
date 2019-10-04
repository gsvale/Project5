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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_locations_list, container, false);

        ListView locationsListView = rootView.findViewById(R.id.list_view_id);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.event_1_name), getString(R.string.event_1_opening_time)));
        locations.add(new Location(getString(R.string.event_2_name), getString(R.string.event_2_opening_time), R.drawable.ic_fantasporto));
        locations.add(new Location(getString(R.string.event_3_name), getString(R.string.event_3_opening_time), R.drawable.ic__saint_john));

        // Create CustomAdapter and pass the context of activity with getActivity(), the arraylist of locations, and a specific color resource
        LocationsAdapter adapter = new LocationsAdapter(getActivity(), locations, R.color.colorRed);

        locationsListView.setAdapter(adapter);

        return rootView;
    }

}
