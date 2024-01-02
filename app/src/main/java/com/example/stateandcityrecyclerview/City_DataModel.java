package com.example.stateandcityrecyclerview;

public class City_DataModel {

    String CityItemTitle;


    public City_DataModel(String childItemTitle)
    {
        this.CityItemTitle = childItemTitle;
    }

    public String getCityItemTitle()
    {
        return CityItemTitle;
    }

    public void setCityItemTitle(String cityItemTitle)
    {
        CityItemTitle= cityItemTitle;
    }
}
