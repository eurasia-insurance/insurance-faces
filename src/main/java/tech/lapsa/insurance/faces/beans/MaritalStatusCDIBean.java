package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.MaritalStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.MaritalStatus;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("MaritalStatus")
@ApplicationScoped
public class MaritalStatusBean implements ListingBean<MaritalStatus> {

    @Override
    public MaritalStatus[] getAll() {
	return values();
    }

    @Override
    public MaritalStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public MaritalStatus[] getNonSelectable() {
	return nonSelectableValues();
    }
}
