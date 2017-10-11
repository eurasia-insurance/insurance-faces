package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.InsuranceProductType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.InsuranceProductType;

@Named("insuranceProductTypeService")
@ApplicationScoped
public class InsuranceProductTypeServiceBean
	implements FacesSelectItemListingService<InsuranceProductType> {

    @Override
    public InsuranceProductType[] getAll() {
	return values();
    }

    @Override
    public InsuranceProductType[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuranceProductType[] getNonSelectable() {
	return nonSelectableValues();
    }
}
