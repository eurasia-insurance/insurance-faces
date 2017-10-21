package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.RequestStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.RequestStatus;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("RequestStatus")
@ApplicationScoped
public class RequestStatusBean implements ListingBean<RequestStatus> {

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
