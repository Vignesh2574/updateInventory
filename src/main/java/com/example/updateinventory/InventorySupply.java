package com.example.updateinventory;

import java.util.Date;

public class InventorySupply {

	private String ItemID;
	private Integer Supply;
	private Date AvailableDate;
	
	public String getItemID() {
		return ItemID;
	}
	public void setItemID(String itemID) {
		ItemID = itemID;
	}
	public Integer getSupply() {
		return Supply;
	}
	public void setSupply(Integer supply) {
		Supply = supply;
	}
	public Date getAvailableDate() {
		return AvailableDate;
	}
	public void setAvailableDate(Date availableDate) {
		AvailableDate = availableDate;
	}
	
	@Override
	public String toString() {
		return "InventorySupply [ItemID=" + ItemID + ", Supply=" + Supply + ", AvailableDate=" + AvailableDate + "]";
	}
	
	public InventorySupply(String itemID, Integer supply, Date availableDate) {
		super();
		ItemID = itemID;
		Supply = supply;
		AvailableDate = availableDate;
	}
	
	
	
	
}
