package com.krok.testtask.orderDetails;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Category {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
  
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    } 
}
