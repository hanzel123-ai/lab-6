package com.example.listcity;

import java.util.ArrayList;
import java.util.List;

public class listycity {
    private List<City> cities = new ArrayList<>();

    /**
     * This method adds a city to the list.
     * If the city already exists in the list, it throws an exception.
     * @param city The city to be added.
     */
    public void addCity(City city) {

        if (cities.contains(city)) {
            throw new IllegalArgumentException("This city already exists in the list.");
        }
        cities.add(city);
    }
    /**
     * This is a class that defines a City.
     */
    public static class City implements Comparable{
        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        private String city;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        private String province;
        City(String city, String province){
            this.city = city;
            this.province = province;
        }
        String getCityName(){
            return this.city;
        }
        String getProvinceName(){
            return this.province;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            City city1 = (City) obj;
            return java.util.Objects.equals(city, city1.city) &&
                    java.util.Objects.equals(province, city1.province);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(city, province);
        }
        @Override
        public int compareTo(Object o) {
            City city = (City) o;
            return this.city.compareTo(city.getCityName()); // this.city refers to the city name
        }
    }

}
