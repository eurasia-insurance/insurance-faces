package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.RequestSource.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.RequestSource;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("RequestSource")
@ApplicationScoped
public class RequestSourceCDIBean implements ListingBean<RequestSource> {

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
