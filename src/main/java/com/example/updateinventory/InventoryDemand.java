package com.example.updateinventory;

import java.util.Date;

public class InventoryDemand {
	
	private String ItemID;
	private Integer Demand;
	private Date LastUpdatedDate;
	
	public String getItemID() {
		return ItemID;
	}
	public void setItemID(String itemID) {
		ItemID = itemID;
	}
	public Integer getDemand() {
		return Demand;
	}
	public void setDemand(Integer demand) {
		Demand = demand;
	}
	public Date getLastUpdatedDate() {
		return LastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		LastUpdatedDate = lastUpdatedDate;
	}
	
	public InventoryDemand(String itemID, Integer demand, Date lastUpdatedDate) {
		super();
		ItemID = itemID;
		Demand = demand;
		LastUpdatedDate = lastUpdatedDate;
	}
	
	@Override
	public String toString() {
		return "InventoryDemad [ItemID=" + ItemID + ", Demand=" + Demand + ", LastUpdatedDate=" + LastUpdatedDate + "]";
	}
	
	

}
