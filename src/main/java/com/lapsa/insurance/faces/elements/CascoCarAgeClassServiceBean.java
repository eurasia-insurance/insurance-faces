package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.CascoCarAgeClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.CascoCarAgeClass;

@Named("cascoCarAgeClassService")
@ApplicationScoped
public class CascoCarAgeClassServiceBean implements FacesSelectItemListingService<CascoCarAgeClass> {

    @Override
    public CascoCarAgeClass[] getAll() {
	return values();
    }

    @Override
    public CascoCarAgeClass[] getSelectable() {
	return selectableValues();
    }

    @Override
    public CascoCarAgeClass[] getNonSelectable() {
	return nonSelectableValues();
    }
}
