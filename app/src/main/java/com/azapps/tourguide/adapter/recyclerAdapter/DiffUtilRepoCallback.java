package com.azapps.tourguide.adapter.recyclerAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.azapps.tourguide.data.Place;

public class DiffUtilRepoCallback extends DiffUtil.ItemCallback<Place> {
    @Override
    public boolean areItemsTheSame(@NonNull Place oldItem, @NonNull Place newItem) {
        return oldItem.getName().equals(newItem.getName());
    }

    @Override
    public boolean areContentsTheSame(@NonNull Place oldItem, @NonNull Place newItem) {
        return oldItem.getRating() == newItem.getRating();
    }
}
