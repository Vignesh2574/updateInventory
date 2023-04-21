package com.example.updateinventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


// to return a set of static values

@RestController
public class AvailabilityController {
    private InventoryService inventoryService;


    @RequestMapping(value = "/getAvailability", method = RequestMethod.POST)
    public Availability getInventoryAvailability(@RequestBody Availability availability, ModelMap map) throws Exception {
        String strItemId = availability.getItemId();
        System.out.println("InDoc "+availability);
        return inventoryService.getAvailabilityForItem(strItemId);
    }
}
