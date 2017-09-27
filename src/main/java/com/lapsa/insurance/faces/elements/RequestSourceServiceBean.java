package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.RequestSource.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.RequestSource;

@Named("requestSourceService")
@ApplicationScoped
public class RequestSourceServiceBean implements FacesSelectItemListingService<RequestSource> {

    @Override
    public RequestSource[] getAll() {
	return values();
    }

    @Override
    public RequestSource[] getSelectable() {
	return selectableValues();
    }

    @Override
    public RequestSource[] getNonSelectable() {
	return nonSelectableValues();
    }
}
