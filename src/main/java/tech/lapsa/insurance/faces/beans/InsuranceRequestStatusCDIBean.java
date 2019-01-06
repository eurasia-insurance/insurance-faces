package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuranceRequestStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuranceRequestStatus;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("InsuranceRequestStatus")
@ApplicationScoped
public class InsuranceRequestStatusCDIBean implements ListingBean<InsuranceRequestStatus> {

    @Override
    public InsuranceRequestStatus[] getAll() {
	return values();
    }

    @Override
    public InsuranceRequestStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuranceRequestStatus[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public InsuranceRequestStatus byName(String name) {
	return InsuranceRequestStatus.valueOf(name);
    }
}
