package com.example.listcity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public abstract class CityList {
    private List<listycity.City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(listycity.City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<listycity.City> getCities() {
        List<listycity.City> list = cities;
        Collections.sort(list);
        return list;
    }
}