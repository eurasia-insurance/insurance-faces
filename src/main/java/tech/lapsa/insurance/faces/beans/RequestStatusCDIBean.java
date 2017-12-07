package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.RequestStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.RequestStatus;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("RequestStatus")
@ApplicationScoped
public class RequestStatusCDIBean implements ListingBean<RequestStatus> {

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
