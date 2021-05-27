package com.azapps.tourguide.adapter.recyclerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.azapps.tourguide.R;
import com.azapps.tourguide.data.Place;

public class PlaceAdapter extends ListAdapter<Place, PlaceViewHolder> {

    private static final DiffUtil.ItemCallback<Place> diffCallback = new DiffUtilRepoCallback();
    public PlaceAdapter() {
        super(diffCallback);
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place
                , parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place place = getItem(position);
        holder.placeNameTV.setText(place.getName());
        holder.placeRatingTV.setText(String.valueOf(place.getRating()));
        holder.placeImage.setImageResource(place.getImageUrl());
    }
}
