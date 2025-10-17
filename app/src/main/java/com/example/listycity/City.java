package com.example.listycity;

import java.util.Objects;

/**
 * THis Class defines city
 */
public class City implements Comparable {
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    public String getCityName(){
        return this.city;
    }

    public String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(Object o){
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(city, province);
    }
}
