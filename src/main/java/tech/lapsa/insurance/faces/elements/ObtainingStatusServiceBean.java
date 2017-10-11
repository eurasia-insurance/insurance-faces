package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.ObtainingStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.ObtainingStatus;

@Named("obtainingStatusService")
@ApplicationScoped
public class ObtainingStatusServiceBean implements FacesSelectItemListingService<ObtainingStatus> {

    @Override
    public ObtainingStatus[] getAll() {
	return values();
    }

    @Override
    public ObtainingStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public ObtainingStatus[] getNonSelectable() {
	return nonSelectableValues();
    }
}
