package com.example.stateandcityrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView StateRecyclerViewItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StateRecyclerViewItem = findViewById(R.id.state_recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        // Pass the arguments
        // to the StateDataAdapter.
        // These arguments are passed
        // using a method ParentItemList()
        StateDataAdapter stateDataAdapter = new StateDataAdapter(state_dataModels());

        // Set the layout manager
        // and adapter for items
        // of the parent recyclerview
        StateRecyclerViewItem.setAdapter(stateDataAdapter);
        StateRecyclerViewItem.setLayoutManager(layoutManager);
    }

    List<State_DataModel> state_dataModels() {
        List<State_DataModel> itemList = new ArrayList<>();

        State_DataModel item = new State_DataModel("Title 1", city_dataModels());
        itemList.add(item);
        State_DataModel item1 = new State_DataModel("Title 2", city_dataModels());
        itemList.add(item1);
        State_DataModel item2 = new State_DataModel("Title 3", city_dataModels());
        itemList.add(item2);
        State_DataModel item3 = new State_DataModel("Title 4", city_dataModels());
        itemList.add(item3);

        return itemList;
    }

    private List<City_DataModel> city_dataModels() {
        List<City_DataModel> city_dataModels
                = new ArrayList<>();

        city_dataModels.add(new City_DataModel("Card 1"));
        city_dataModels.add(new City_DataModel("Card 2"));
        city_dataModels.add(new City_DataModel("Card 3"));
        city_dataModels.add(new City_DataModel("Card 4"));

        return city_dataModels;
    }
}