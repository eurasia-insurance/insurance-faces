package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuranceRequestCancellationReason.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuranceRequestCancellationReason;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("InsuranceRequestCancellationReason")
@ApplicationScoped
public class InsuranceRequestCancellationReasonCDIBean implements ListingBean<InsuranceRequestCancellationReason> {

    @Override
    public InsuranceRequestCancellationReason[] getAll() {
	return values();
    }

    @Override
    public InsuranceRequestCancellationReason[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuranceRequestCancellationReason[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public InsuranceRequestCancellationReason byName(String name) {
	return InsuranceRequestCancellationReason.valueOf(name);
    }
}
