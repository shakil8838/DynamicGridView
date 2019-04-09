package com.example.dynamicgridviewpractice.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dynamicgridviewpractice.R;
import com.example.dynamicgridviewpractice.dataprovider.GridDataProvider;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter{

    private Context mContext;
    private int resId;
    private ArrayList<GridDataProvider> gridDataProviderList;

    public GridViewAdapter(Context mContext, ArrayList<GridDataProvider> gridDataProviderList) {
        this.mContext = mContext;
        this.gridDataProviderList = gridDataProviderList;
    }

    @Override
    public int getCount() {
        return gridDataProviderList.size();
    }

    @Override
    public Object getItem(int i) {
        return gridDataProviderList.size();
    }

    @Override
    public long getItemId(int i) {
        return gridDataProviderList.size();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            view = LayoutInflater.from(mContext)
                    .inflate(R.layout.layout_grid_item, viewGroup, false);

            TextView gridItem = view.findViewById(R.id.grid_irem_name);
            gridItem.setText(gridDataProviderList.get(i).getGridItems());
        }
        return view;
    }
}
