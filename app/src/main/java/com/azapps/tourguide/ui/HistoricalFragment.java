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

public class HistoricalFragment extends Fragment {
    private ArrayList<Place> placesArrayList;

    private HistoricalFragment() {

    }

    public static HistoricalFragment newInstance() {
        return new HistoricalFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_historical, container, false);
        populateArrayList();
        initRecyclerView(view);
        return view;
    }

    private void populateArrayList() {
        placesArrayList = new ArrayList<>();
        placesArrayList.add(new Place(getString(R.string.dar_ebn_lookman), R.drawable.dar_ebn_lookman, 6.1));
        placesArrayList.add(new Place(getString(R.string.temple_of_karnak), R.drawable.temple_of_karnak, 8.0));
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.fragment_historical_recycler_view_rv);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        recyclerView.hasFixedSize();
        PlaceAdapter adapter = new PlaceAdapter();
        adapter.submitList(placesArrayList);
        recyclerView.setAdapter(adapter);
    }
}
