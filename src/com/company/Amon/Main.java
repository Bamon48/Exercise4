/*
Benton Amon
Exercise 4
Uses user input for cities and the next 5 average daily temperatures and prints the city and the average temp.
 */

package com.company.Amon;

import java.util.*;

public class Main {

    // Functions
    static void enterCities(Map<String, String> cities) {
        Scanner input = new Scanner(System.in);
        String city="blah";
        while(!city.equals("END")) {
            System.out.println("Enter the name of a city (enter 'END' to exit): ");
            city = input.nextLine();
            if(!city.equals("END")) {
                cities.put(city, "");
            }
        }
    }


    static void getTemps(Map<String, String> cities) {
        Scanner input = new Scanner(System.in);
        String key;
        String value;

        System.out.println("Please enter the average daily temperatures for each of the next 5 days for...");
        for(Map.Entry<String, String> entry : cities.entrySet()) {
            key = entry.getKey();
            System.out.print(key + ": ");
            value = input.nextLine();
            cities.put(key, value);
        }
    }


    static int getAvgTemp(String value) {
        int counter = 0;
        int sum = 0;
        String[] array = value.split(" ");
        for(int i=0; i < array.length; i++, counter++) {
            sum = sum + Integer.parseInt(array[i]);
        }
        return sum/counter;
    }


    static void displayResults(Map<String, String> cities) {
        String key;
        String value;
        for (Map.Entry<String,String> entry : cities.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            System.out.println(key + "'s average temperature is: " + getAvgTemp(value));

        }

    }


    public static void main(String[] args) {

        // Create Hash Map
        Map<String, String> cities = new HashMap<>();

        // Main
        enterCities(cities);
        getTemps(cities);
        displayResults(cities);


    }
}
