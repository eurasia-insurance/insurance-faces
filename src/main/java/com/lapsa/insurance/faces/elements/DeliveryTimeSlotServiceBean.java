package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.DeliveryTimeSlot.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.DeliveryTimeSlot;

@Named("deliveryTimeSlotService")
@ApplicationScoped
public class DeliveryTimeSlotServiceBean implements FacesSelectItemListingService<DeliveryTimeSlot> {

    @Override
    public DeliveryTimeSlot[] getAll() {
	return values();
    }

    @Override
    public DeliveryTimeSlot[] getSelectable() {
	return selectableValues();
    }

    @Override
    public DeliveryTimeSlot[] getNonSelectable() {
	return nonSelectableValues();
    }
}
