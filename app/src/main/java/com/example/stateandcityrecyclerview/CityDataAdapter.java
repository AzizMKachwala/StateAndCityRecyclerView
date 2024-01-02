package com.example.stateandcityrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CityDataAdapter extends RecyclerView.Adapter<CityDataAdapter.CityDataViewHolder> {

    List<City_DataModel> city_dataModels;

    public CityDataAdapter(List<City_DataModel> city_dataModels) {
        this.city_dataModels = city_dataModels;
    }

    @NonNull
    @Override
    public CityDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.city_item_data, parent, false);
        return new CityDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityDataViewHolder cityDataViewHolder, int position) {
        City_DataModel cityModel = city_dataModels.get(position);
        cityDataViewHolder.cityItemTitle.setText(cityModel.getCityItemTitle());
    }

    @Override
    public int getItemCount() {
        return city_dataModels.size();
    }

    public class CityDataViewHolder extends RecyclerView.ViewHolder {

        TextView cityItemTitle;

        public CityDataViewHolder(@NonNull View itemView) {
            super(itemView);
            cityItemTitle = itemView.findViewById(R.id.cityItemTitle);
        }
    }
}
