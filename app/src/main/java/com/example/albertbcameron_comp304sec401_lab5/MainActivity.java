package com.example.albertbcameron_comp304sec401_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] cuisineTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find list view by id
        ListView cuisineTypeListView = (ListView) findViewById(R.id.cuisineTypeListView);

        // Create and assign adapter
        cuisineTypes = RestaurantStaticDataList.getAllCuisineTypes();
        ArrayAdapter cuisineTypeAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cuisineTypes);
        cuisineTypeListView.setAdapter(cuisineTypeAdapter);

        // Set on item click listener
        cuisineTypeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Create the intent for RestaurantListActivity
                Intent restaurantListActivity = new Intent(MainActivity.this, RestaurantListActivity.class);
                restaurantListActivity.putExtra("selectedCuisineType", cuisineTypes[i]);
                // Start the activity
                startActivity(restaurantListActivity);
            }
        });
    }
}