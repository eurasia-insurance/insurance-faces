package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuranceRequestCancelationReason.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuranceRequestCancelationReason;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("InsuranceRequestCancelationReason")
@ApplicationScoped
public class InsuranceRequestCancelationReasonCDIBean implements ListingBean<InsuranceRequestCancelationReason> {

    @Override
    public InsuranceRequestCancelationReason[] getAll() {
	return values();
    }

    @Override
    public InsuranceRequestCancelationReason[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuranceRequestCancelationReason[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public InsuranceRequestCancelationReason byName(String name) {
	return InsuranceRequestCancelationReason.valueOf(name);
    }
}
