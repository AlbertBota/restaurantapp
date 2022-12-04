package com.example.albertbcameron_comp304sec401_lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RestaurantStaticDataList {

    private static List<Restaurant> allRestaurants = new ArrayList<>();
    private static String[] allCuisineTypes;
    private static boolean initiated = false;

    public static void initiate(){
        // Get all restaurants from the generator
        RestaurantDataGenerator generator = new RestaurantDataGenerator();
        allRestaurants = generator.getAllRestaurants();

        // Create cuisine list
        List<String> allCuisines = new ArrayList<>();
        for (int i = 0; i < allRestaurants.size(); i++)
        {
            if (allCuisines.indexOf(allRestaurants.get(i).type) == -1)
            {
                allCuisines.add(allRestaurants.get(i).type);
            }
        }

        // Sort by alphabetically order
        Collections.sort(allCuisines);

        // Update the all cuisine []
        allCuisineTypes = new String[allCuisines.size()];
        allCuisines.toArray(allCuisineTypes);
        initiated = true;
    }

    public static String[] getAllCuisineTypes(){
        if (!initiated)
        {
            initiate();
        }

        return allCuisineTypes;
    }

    // Get restaurants by cuisine type
    public static List<Restaurant> getRestaurantsByCuisineType(String cuisineType)
    {
        if (!initiated)
        {
            initiate();
        }

        List<Restaurant> restaurants = new ArrayList<>();
        for (int i = 0; i < allRestaurants.size(); i++)
        {
            if (allRestaurants.get(i).type.equals(cuisineType)) {
                restaurants.add(allRestaurants.get(i));
            }
        }
        return restaurants;
    }

    public static String[] getRestaurantIDsByCuisineType(String cuisineType)
    {
        if (!initiated)
        {
            initiate();
        }

        List<String> restaurants = new ArrayList<>();
        for (int i = 0; i < allRestaurants.size(); i++)
        {
            if (allRestaurants.get(i).type.equals(cuisineType)) {
                restaurants.add(String.valueOf(allRestaurants.get(i).id));
            }
        }

        // Convert list to []
        String[] restaurantIDs = new String[restaurants.size()];
        restaurants.toArray(restaurantIDs);
        return restaurantIDs;
    }

    public static Restaurant getRestaurantByRestaurantId(String id)
    {
        if (!initiated)
        {
            initiate();
        }

        int restaurantId = Integer.parseInt(id);
        return allRestaurants.get(restaurantId);
    }

}
