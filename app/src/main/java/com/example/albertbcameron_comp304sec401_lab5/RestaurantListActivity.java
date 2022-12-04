package com.example.albertbcameron_comp304sec401_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class RestaurantListActivity extends AppCompatActivity {

    private String selectedCuisineType;
    private String[] restaurantIDs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);

        // Retrieve edit patient id from extras
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            selectedCuisineType = extras.getString("selectedCuisineType");
            if (selectedCuisineType.length() > 0) {
                // Find list view by id
                ListView restaurantListView = (ListView) findViewById(R.id.restaurantListView);

                // Create and assign adapter
                List<Restaurant> restaurants = RestaurantStaticDataList.getRestaurantsByCuisineType(selectedCuisineType);
                restaurantIDs = RestaurantStaticDataList.getRestaurantIDsByCuisineType(selectedCuisineType);
                RestaurantListAdapter adapter = new RestaurantListAdapter(this, restaurants, restaurantIDs);
                restaurantListView.setAdapter(adapter);

                // Set on item click listener
                restaurantListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        // Create the intent for MapsActivity
                        Intent mapsActivity = new Intent(RestaurantListActivity.this, MapsActivity.class);
                        mapsActivity.putExtra("selectedRestaurantId", restaurantIDs[i]);
                        // Start the activity
                        startActivity(mapsActivity);
                    }
                });
            }
        }
    }
}