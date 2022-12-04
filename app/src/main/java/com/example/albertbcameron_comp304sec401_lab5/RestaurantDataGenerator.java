package com.example.albertbcameron_comp304sec401_lab5;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDataGenerator {

    private static final String[] NAME = new String[]{
            "Rosalinda Restaurant",
            "Veggie Flames",
            "Mayrik",
            "Planta",
            "Fresh Restaurants",
            "Selam Restaurant & Lounge",
            "Govinda's",
            "Mugi plant-based Thai restaurant",
            "Tenon Vegan Sushi",
            "Fennel Organic Eatery",
            "Guerrilla Burger",
            "Annapurna Vegetarian",
            "Lady Hummingbird Culinary Arts Inc.",
            "Tapi Go!",
            "Pizza Del Arte",
            "Riz on St. Clair Restaurant",
            "African Palace",
    };

    private static final String[] TYPE = new String[]{
            "Italian",
            "Indian",
            "Eastern Mediterranean",
            "Italian",
            "American",
            "African",
            "Indian",
            "Thai",
            "Japanese",
            "Italian",
            "American",
            "Indian",
            "African",
            "Brazilian",
            "Italian",
            "Asian",
            "African",
    };

    private static final String[] ADDRESS = new String[]{
            "133 Richmond St W, Toronto, ON M5H 2L3",
            "7210 Airport Rd, Mississauga, ON L4T 2H3",
            "1580 Bayview Ave, Toronto, ON M4G 3B7",
            "1221 Bay St., Toronto, ON M5R 3P5",
            "147 Spadina Ave., Toronto, ON M5V 2L7",
            "812 Bloor St W, Toronto, ON M6G 1L9",
            "243 Avenue Road Entrance off Roxborough next to, driveway, Toronto, ON M5R 2J6",
            "793 Bathurst St, Toronto, ON M5S 1Z5",
            "487 Bloor St W, Toronto, ON M5S 1Y2",
            "322 Bloor St W, Toronto, ON M5S 1W5",
            "454 Bloor St W, Toronto, ON M5S 1X8",
            "1085 Bathurst St, Toronto, ON M5R 3G8",
            "601 Christie St #159, Toronto, ON M6G 4C6",
            "835 Bloor St W, Toronto, ON M6G 1M1",
            "1480 Bathurst St, York, ON M5P 3G9",
            "760 St Clair Ave W, Toronto, ON M6C 1B5",
            "977 Bloor St W, Toronto, ON M6H 1L8",
    };

    private static final double[] LATITUDES = new double[]{
            43.656615222525055,
            43.7117753566002,
            43.70997678749059,
            43.674764288026196,
            43.651983535251176,
            43.66805788974749,
            43.68194391528037,
            43.668729421973886,
            43.67155830311121,
            43.672024757630986,
            43.67087954628017,
            43.67633380592746,
            43.68384046590224,
            43.66596404522969,
            43.685842419973454,
            43.686151744442846,
            43.6654374330638,
    };

    private static final double[] LONGITUDES = new double[]{
            -79.38515924551407,
            -79.64814307212156,
            -79.37543968151506,
            -79.38910652868987,
            -79.39912587358415,
            -79.42024972943642,
            -79.39728288000791,
            -79.41088416716538,
            -79.40700959427852,
            -79.40368798117439,
            -79.40913171297683,
            -79.41474737654536,
            -79.42392277514932,
            -79.42470295529091,
            -79.41829721502708,
            -79.42877126892958,
            -79.42970581404008
    };

    public static final int[] IMAGEID = new int[]{
            R.drawable.italian_1, //"Italian",
            R.drawable.indian_1, //"Indian",
            R.drawable.mediterranean_1, //"Eastern Mediterranean",
            R.drawable.italian_2, //"Italian",
            R.drawable.american_1, //"American",
            R.drawable.african_1, //"African",
            R.drawable.indian_2, //"Indian",
            R.drawable.thai_1, //"Thai",
            R.drawable.japanese_1, //"Japanese",
            R.drawable.italian_3, //"Italian",
            R.drawable.american_2, //"American",
            R.drawable.indian_3, //"Indian",
            R.drawable.african_2, //"African",
            R.drawable.brazilian_1, //"Brazilian",
            R.drawable.italian_4, //"Italian",
            R.drawable.asian_1, //"Asian",
            R.drawable.african_3, //"African",
    };

    // Generate static restaurant list
    public List<Restaurant> getAllRestaurants(){
        List<Restaurant> allRestaurants = new ArrayList<>();
        for (int i = 0; i < NAME.length; i++)
        {
            Restaurant restaurant = new Restaurant(i, NAME[i], TYPE[i], ADDRESS[i], LATITUDES[i], LONGITUDES[i], IMAGEID[i]);
            allRestaurants.add(restaurant);
        }
        return allRestaurants;
    }
}
