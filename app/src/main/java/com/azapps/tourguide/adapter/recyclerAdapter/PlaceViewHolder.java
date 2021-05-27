package com.azapps.tourguide.adapter.recyclerAdapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.azapps.tourguide.R;

public class PlaceViewHolder extends RecyclerView.ViewHolder {
    TextView placeNameTV;
    TextView placeRatingTV;
    ImageView placeImage;

    public PlaceViewHolder(@NonNull View itemView) {
        super(itemView);
        placeNameTV = itemView.findViewById(R.id.item_place_name_tv);
        placeRatingTV = itemView.findViewById(R.id.item_place_rating_number_tv);
        placeImage = itemView.findViewById(R.id.item_place_image_img);
    }
}
