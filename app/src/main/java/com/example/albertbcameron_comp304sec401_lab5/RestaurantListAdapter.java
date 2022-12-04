package com.example.albertbcameron_comp304sec401_lab5;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RestaurantListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private List<Restaurant> restaurantList;

    public RestaurantListAdapter(Activity context, List<Restaurant> restaurantList, String[] restaurantId) {
        super(context, R.layout.list_restaurant, restaurantId);
        this.context = context;
        this.restaurantList = restaurantList;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View restaurantListView = inflater.inflate(R.layout.list_restaurant, null,true);

        ImageView image = (ImageView) restaurantListView.findViewById(R.id.image);
        TextView name = (TextView) restaurantListView.findViewById(R.id.name);
        TextView type = (TextView) restaurantListView.findViewById(R.id.type);
        TextView address = (TextView) restaurantListView.findViewById(R.id.address);

        Restaurant restaurant = restaurantList.get(position);
        if (restaurant != null) {
            image.setImageResource(restaurant.imageId);
            name.setText(restaurant.name);
            type.setText(restaurant.type);
            address.setText(restaurant.address);
        }

        return restaurantListView;
    }
}
