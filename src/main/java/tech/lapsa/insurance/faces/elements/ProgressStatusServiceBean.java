package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.ProgressStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.ProgressStatus;

@Named("progressStatusService")
@ApplicationScoped
public class ProgressStatusServiceBean implements FacesSelectItemListingService<ProgressStatus> {

    @Override
    public ProgressStatus[] getAll() {
	return values();
    }

    @Override
    public ProgressStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public ProgressStatus[] getNonSelectable() {
	return nonSelectableValues();
    }
}
