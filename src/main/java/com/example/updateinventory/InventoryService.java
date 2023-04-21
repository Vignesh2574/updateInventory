package com.example.updateinventory;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

@Service
public class InventoryService {

	public static List<InventorySupply> listInvSuppply = new ArrayList<>();
	public static List<InventoryDemand> listInvDemand = new ArrayList<>();

	static {
		
		listInvSuppply.add(new InventorySupply("I001",  10, new Date(2023, 04, 19, 5, 30)));
		listInvSuppply.add(new InventorySupply("I002",  25, new Date(2023, 04, 18, 8, 30)));
		listInvSuppply.add(new InventorySupply("I003",  5,  new Date(2023, 04, 17, 2, 30)));
		
		listInvDemand.add(new InventoryDemand("I001",  8,  new Date(2023, 04, 19, 5, 30)));
		listInvDemand.add(new InventoryDemand("I002",  25, new Date(2023, 04, 18, 8, 30)));
		listInvDemand.add(new InventoryDemand("I003",  10, new Date(2023, 04, 17, 2, 30)));
	}

	public Availability getAvailabilityForItem(String strItemId) throws Exception {
		System.out.println(strItemId);
		Predicate<InventorySupply> getSupplyByItemId = supply -> supply.getItemID().equalsIgnoreCase(strItemId);
		Predicate<InventoryDemand> getDemandByItemId = demand -> demand.getItemID().equalsIgnoreCase(strItemId);
		InventorySupply supply = listInvSuppply.stream().filter(getSupplyByItemId).findFirst().orElseThrow(Exception::new);
		InventoryDemand demand = listInvDemand.stream().filter(getDemandByItemId).findFirst().orElseThrow(Exception::new);
		if(supply.getSupply()-demand.getDemand()>0){
			return new Availability(strItemId,supply.getSupply()-demand.getDemand());
		}else{
			throw new ResponseStatusException(HttpStatus.valueOf(201), "Custom Exception");
		}

	}

}
