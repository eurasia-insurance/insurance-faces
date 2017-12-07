package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.ObtainingStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.ObtainingStatus;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("ObtainingStatus")
@ApplicationScoped
public class ObtainingStatusCDIBean implements ListingBean<ObtainingStatus> {

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
