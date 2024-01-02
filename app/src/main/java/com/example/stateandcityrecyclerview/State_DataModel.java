package com.example.stateandcityrecyclerview;

import java.util.List;

public class State_DataModel {
    String StateItemTitle;
    List<City_DataModel> City_DataModelList;
    
    public State_DataModel(
            String StateItemTitle,
            List<City_DataModel> City_DataModelList)
    {

        this.StateItemTitle = StateItemTitle;
        this.City_DataModelList = City_DataModelList;
    }
    
    public String getStateItemTitle()
    {
        return StateItemTitle;
    }

    public void setStateItemTitle(String StateItemTitle)
    {
        StateItemTitle = StateItemTitle;
    }

    public List<City_DataModel> getCity_DataModelList()
    {
        return City_DataModelList;
    }

    public void setCity_DataModelList(List<City_DataModel> City_DataModelList)
    {
        City_DataModelList = City_DataModelList;
    }
}
