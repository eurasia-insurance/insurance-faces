package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.Sex.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.Sex;

@Named("sexService")
@ApplicationScoped
public class SexServiceBean implements FacesSelectItemListingService<Sex> {

    @Override
    public Sex[] getAll() {
	return values();
    }

    @Override
    public Sex[] getSelectable() {
	return selectableValues();
    }

    @Override
    public Sex[] getNonSelectable() {
	return nonSelectableValues();
    }
}
