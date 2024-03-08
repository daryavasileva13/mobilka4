package com.example.mobilka4;

public class Item {
    private String itemName;
    private int itemImageResId;

    public Item( int itemImageResId, String itemName) {
        this.itemImageResId = itemImageResId;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemImageResId() {
        return itemImageResId;
    }
}

