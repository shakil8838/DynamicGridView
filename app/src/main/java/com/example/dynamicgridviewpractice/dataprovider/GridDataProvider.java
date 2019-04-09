package com.example.dynamicgridviewpractice.dataprovider;

public class GridDataProvider {

    private String gridItems;

    public GridDataProvider(String gridItems) {
        this.gridItems = gridItems;
    }

    public String getGridItems() {
        return gridItems;
    }

    public void setGridItems(String gridItems) {
        this.gridItems = gridItems;
    }
}
