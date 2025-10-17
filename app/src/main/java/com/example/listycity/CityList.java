package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *    this is a candidate city to add
     */
    public void add(City city) {

        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     *
     * @return
     *  Return the sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * When a given city, return whether or not it belongs in the list
     * @param city
     *    this is a candidate city to add
     * @return
     *    Return whether or not the city belongs in the list
     *    true if it does, false if it does not
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This deletes a city from the list
     *
     * @param city
     *    this is a candidate city to delete
     *
     */
    public void delete(City city) {
        if (hasCity(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This returns the number of cities in the list
     *
     * @return
     *      integer representing the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }

}
