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

public class StadiumsFragment extends Fragment {
    private ArrayList<Place> placesArrayList;
    public StadiumsFragment(){

    }

    public static StadiumsFragment newInstance(){
        return new StadiumsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stadiums, container, false);
        populateArrayList();
        initRecyclerView(view);
        return view;
    }

    private void populateArrayList() {
        placesArrayList = new ArrayList<>();
        placesArrayList.add(new Place(getString(R.string.mansoura_stadium), R.drawable.mansoura_stadium, 8.5));
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.fragment_stadiums_recycler_view_rv);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        recyclerView.hasFixedSize();
        PlaceAdapter adapter = new PlaceAdapter();
        adapter.submitList(placesArrayList);
        recyclerView.setAdapter(adapter);
    }
}
