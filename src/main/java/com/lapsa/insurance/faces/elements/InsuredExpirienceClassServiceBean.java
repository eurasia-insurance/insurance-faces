package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.InsuredExpirienceClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.InsuredExpirienceClass;

@Named("insuredExpirienceClassService")
@ApplicationScoped
public class InsuredExpirienceClassServiceBean implements FacesSelectItemListingService<InsuredExpirienceClass> {

    @Override
    public InsuredExpirienceClass[] getAll() {
	return values();
    }

    @Override
    public InsuredExpirienceClass[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuredExpirienceClass[] getNonSelectable() {
	return nonSelectableValues();
    }
}
