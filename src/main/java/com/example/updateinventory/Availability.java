package com.example.updateinventory;

public class Availability {
    private String ItemId;
    private Integer AvailableQty;

    public Availability(String itemId, Integer availableQty) {
        ItemId = itemId;
        AvailableQty = availableQty;
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public Integer getAvailableQty() {
        return AvailableQty;
    }

    public void setAvailableQty(Integer availableQty) {
        AvailableQty = availableQty;
    }

    @Override
    public String toString() {
        return "Availability{" +
                "ItemId='" + ItemId + '\'' +
                ", AvailableQty=" + AvailableQty +
                '}';
    }
}
