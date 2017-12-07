package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.CancelationReason.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.CancelationReason;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("CancelationReason")
@ApplicationScoped
public class CancelationReasonCDIBean implements ListingBean<CancelationReason> {

    @Override
    public CancelationReason[] getAll() {
	return values();
    }

    @Override
    public CancelationReason[] getSelectable() {
	return selectableValues();
    }

    @Override
    public CancelationReason[] getNonSelectable() {
	return nonSelectableValues();
    }
}
