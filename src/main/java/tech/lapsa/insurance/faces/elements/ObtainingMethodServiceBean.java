package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.ObtainingMethod.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.ObtainingMethod;

@Named("obtainingMethodService")
@ApplicationScoped
public class ObtainingMethodServiceBean implements FacesSelectItemListingService<ObtainingMethod> {

    @Override
    public ObtainingMethod[] getAll() {
	return values();
    }

    @Override
    public ObtainingMethod[] getSelectable() {
	return selectableValues();
    }

    @Override
    public ObtainingMethod[] getNonSelectable() {
	return nonSelectableValues();
    }
}
