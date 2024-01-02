package com.example.stateandcityrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateDataAdapter extends RecyclerView.Adapter<StateDataAdapter.StateDataViewHolder> {

    List<State_DataModel> state_dataModels;
    RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();

    public StateDataAdapter(List<State_DataModel> state_dataModels) {
        this.state_dataModels = state_dataModels;
    }

    @NonNull
    @Override
    public StateDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.state_item_data,parent,false);
        return new StateDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateDataViewHolder holder, int position) {
        State_DataModel stateModel = state_dataModels.get(position);
        holder.stateItemTitle.setText(stateModel.getStateItemTitle());

        LinearLayoutManager layoutManager = new LinearLayoutManager(StateDataViewHolder.city_recyclerview.getContext());
        layoutManager.setInitialPrefetchItemCount(stateModel.getCity_DataModelList().size());

        CityDataAdapter cityDataAdapter = new CityDataAdapter(stateModel.getCity_DataModelList());
        StateDataViewHolder.city_recyclerview.setLayoutManager(layoutManager);
        StateDataViewHolder.city_recyclerview.setAdapter(cityDataAdapter);
        StateDataViewHolder.city_recyclerview.setRecycledViewPool(viewPool);
    }


    @Override
    public int getItemCount() {
        return state_dataModels.size();
    }

    public class StateDataViewHolder extends RecyclerView.ViewHolder{

        static TextView stateItemTitle;
        static RecyclerView city_recyclerview;

        public StateDataViewHolder(@NonNull View itemView) {
            super(itemView);
            stateItemTitle = itemView.findViewById(R.id.stateItemTitle);
            city_recyclerview = itemView.findViewById(R.id.cityItemTitle);
        }
    }
}
