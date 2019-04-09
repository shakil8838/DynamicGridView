package com.example.dynamicgridviewpractice;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.example.dynamicgridviewpractice.adapters.GridViewAdapter;
import com.example.dynamicgridviewpractice.dataprovider.GridDataProvider;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // Dealer all variables
    private String[] gridItems;
    private ArrayList<GridDataProvider> dataProvidersList;

    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize all widgets

        dataProvidersList = new ArrayList<>();
        dataProvidersList.add(new GridDataProvider("ItemOne"));
        dataProvidersList.add(new GridDataProvider("ItemTwo"));
        dataProvidersList.add(new GridDataProvider("ItemThree"));
        dataProvidersList.add(new GridDataProvider("ItemFour"));
        dataProvidersList.add(new GridDataProvider("ItemFive"));
        dataProvidersList.add(new GridDataProvider("ItemSix"));
        dataProvidersList.add(new GridDataProvider("ItemSeven"));
        dataProvidersList.add(new GridDataProvider("ItemEight"));
        dataProvidersList.add(new GridDataProvider("ItemNine"));
        dataProvidersList.add(new GridDataProvider("ItemTen"));

        mGridView = findViewById(R.id.main_grid_view);
        mGridView.setAdapter(new GridViewAdapter(getApplicationContext(), dataProvidersList));

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }
}
