package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.RequestStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.RequestStatus;

@Named("requestStatusService")
@ApplicationScoped
public class RequestStatusServiceBean implements FacesSelectItemListingService<RequestStatus> {

    @Override
    public RequestStatus[] getAll() {
	return values();
    }

    @Override
    public RequestStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public RequestStatus[] getNonSelectable() {
	return nonSelectableValues();
    }
}
