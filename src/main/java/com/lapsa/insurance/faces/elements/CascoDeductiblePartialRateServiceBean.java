package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.CascoDeductiblePartialRate.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.CascoDeductiblePartialRate;

@Named("cascoDeductiblePartialRateService")
@ApplicationScoped
public class CascoDeductiblePartialRateServiceBean
	implements FacesSelectItemListingService<CascoDeductiblePartialRate> {

    @Override
    public CascoDeductiblePartialRate[] getAll() {
	return values();
    }

    @Override
    public CascoDeductiblePartialRate[] getSelectable() {
	return selectableValues();
    }

    @Override
    public CascoDeductiblePartialRate[] getNonSelectable() {
	return nonSelectableValues();
    }
}
