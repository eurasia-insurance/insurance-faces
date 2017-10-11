package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.SubjectType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.SubjectType;

@Named("subjectTypeService")
@ApplicationScoped
public class SubjectTypeServiceBean implements FacesSelectItemListingService<SubjectType> {

    @Override
    public SubjectType[] getAll() {
	return values();
    }

    @Override
    public SubjectType[] getSelectable() {
	return selectableValues();
    }

    @Override
    public SubjectType[] getNonSelectable() {
	return nonSelectableValues();
    }
}
