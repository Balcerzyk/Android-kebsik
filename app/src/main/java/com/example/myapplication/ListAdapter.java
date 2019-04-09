package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private  List<ListItem> listItems;
    private Context context;

    public ListAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ListItem listItem = listItems.get(i);

        viewHolder.textViewTitle.setText(listItem.getTitle());
        viewHolder.textViewAddress.setText(listItem.getAddress());
        if(listItem.getIfOpen() == "Otwarte") viewHolder.textViewIfOpen.setTextColor(Color.GREEN);
        else viewHolder.textViewIfOpen.setTextColor(Color.RED);
        viewHolder.textViewIfOpen.setText(listItem.getIfOpen());
        viewHolder.textViewOpenTime.setText(listItem.getOpenTime());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewTitle;
        public TextView textViewAddress;
        public TextView textViewIfOpen;
        public TextView textViewOpenTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitle = (TextView) itemView.findViewById(R.id.title);
            textViewAddress = (TextView) itemView.findViewById(R.id.address);
            textViewIfOpen = (TextView) itemView.findViewById(R.id.ifOpen);
            textViewOpenTime = (TextView) itemView.findViewById(R.id.openTime);
        }
    }

}
