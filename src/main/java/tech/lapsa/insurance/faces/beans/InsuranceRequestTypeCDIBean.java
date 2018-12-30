package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuranceRequestType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuranceRequestType;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("InsuranceRequestType")
@ApplicationScoped
public class InsuranceRequestTypeCDIBean implements ListingBean<InsuranceRequestType> {

    @Override
    public InsuranceRequestType[] getAll() {
	return values();
    }

    @Override
    public InsuranceRequestType[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuranceRequestType[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public InsuranceRequestType byName(String name) {
	return InsuranceRequestType.valueOf(name);
    }
}
