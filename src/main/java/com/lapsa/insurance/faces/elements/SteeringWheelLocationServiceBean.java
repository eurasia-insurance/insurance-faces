package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.SteeringWheelLocation.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.SteeringWheelLocation;

@Named("steeringWheelLocationService")
@ApplicationScoped
public class SteeringWheelLocationServiceBean implements FacesSelectItemListingService<SteeringWheelLocation> {

    @Override
    public SteeringWheelLocation[] getAll() {
	return values();
    }

    @Override
    public SteeringWheelLocation[] getSelectable() {
	return selectableValues();
    }

    @Override
    public SteeringWheelLocation[] getNonSelectable() {
	return nonSelectableValues();
    }
}
