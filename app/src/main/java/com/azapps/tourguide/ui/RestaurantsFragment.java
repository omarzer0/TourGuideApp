package com.azapps.tourguide.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.azapps.tourguide.R;
import com.azapps.tourguide.adapter.recyclerAdapter.PlaceAdapter;
import com.azapps.tourguide.data.Place;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    private ArrayList<Place> placesArrayList;
    public RestaurantsFragment(){

    }

    public static RestaurantsFragment newInstance(){
        return new RestaurantsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);
        populateArrayList();
        initRecyclerView(view);
        return view;
    }
    private void populateArrayList() {
        placesArrayList = new ArrayList<>();
        placesArrayList.add(new Place(getString(R.string.chicken_briskets), R.drawable.chicken_briskets, 9.0));
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.fragment_restaurants_recycler_view_rv);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        recyclerView.hasFixedSize();
        PlaceAdapter adapter = new PlaceAdapter();
        adapter.submitList(placesArrayList);
        recyclerView.setAdapter(adapter);
    }
}
