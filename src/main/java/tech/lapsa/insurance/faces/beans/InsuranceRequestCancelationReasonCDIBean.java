package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.RequestCancelationReason.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.RequestCancelationReason;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("RequestCancelationReason")
@ApplicationScoped
public class RequestCancelationReasonCDIBean implements ListingBean<RequestCancelationReason> {

    @Override
    public RequestCancelationReason[] getAll() {
	return values();
    }

    @Override
    public RequestCancelationReason[] getSelectable() {
	return selectableValues();
    }

    @Override
    public RequestCancelationReason[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public RequestCancelationReason byName(String name) {
	return RequestCancelationReason.valueOf(name);
    }
}
