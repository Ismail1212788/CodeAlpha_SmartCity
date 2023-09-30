// src/main/java/com/example/smartcity/model/CityInfo.java

package com.example.SmartCity;

public class CityInfo {
    private String name;
    private String description;
    private int population;

    public CityInfo() {
    }

    public CityInfo(String name, String description, int population) {
        this.name = name;
        this.description = description;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

  
    
}
