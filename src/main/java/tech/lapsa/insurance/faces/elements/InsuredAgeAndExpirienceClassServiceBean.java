package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.InsuredAgeAndExpirienceClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.InsuredAgeAndExpirienceClass;

@Named("insuredAgeAndExpirienceClassService")
@ApplicationScoped
public class InsuredAgeAndExpirienceClassServiceBean implements FacesSelectItemListingService<InsuredAgeAndExpirienceClass> {

    @Override
    public InsuredAgeAndExpirienceClass[] getAll() {
	return values();
    }

    @Override
    public InsuredAgeAndExpirienceClass[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuredAgeAndExpirienceClass[] getNonSelectable() {
	return nonSelectableValues();
    }
}
