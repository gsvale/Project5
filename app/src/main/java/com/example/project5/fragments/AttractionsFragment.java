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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_locations_list, container, false);

        ListView locationsListView = rootView.findViewById(R.id.list_view_id);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.attraction_1_name), getString(R.string.attraction_1_opening_time), R.drawable.ic_clerics_tower));
        locations.add(new Location(getString(R.string.attraction_2_name), getString(R.string.attraction_2_opening_time), R.drawable.ic_lello_bookstore));
        locations.add(new Location(getString(R.string.attraction_3_name), getString(R.string.attraction_3_opening_time), R.drawable.ic_aliados_avenue));
        locations.add(new Location(getString(R.string.attraction_4_name), getString(R.string.attraction_4_opening_time), R.drawable.ic_music_house));
        locations.add(new Location(getString(R.string.attraction_5_name), getString(R.string.attraction_5_opening_time), R.drawable.ic_serralves_foundation));
        locations.add(new Location(getString(R.string.attraction_6_name), getString(R.string.attraction_6_opening_time), R.drawable.ic_foz_douro));
        locations.add(new Location(getString(R.string.attraction_7_name), getString(R.string.attraction_7_opening_time), R.drawable.ic_crystal_palace_gardens));


        // Create CustomAdapter and pass the context of activity with getActivity(), the arraylist of locations, and a specific color resource
        LocationsAdapter adapter = new LocationsAdapter(getActivity(), locations, R.color.colorOrange);

        locationsListView.setAdapter(adapter);

        return rootView;
    }

}
