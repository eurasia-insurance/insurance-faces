package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuranceRequestType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuranceRequestType;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("InsuranceRequestType")
@ApplicationScoped
public class InsuranceRequestTypeBean implements ListingBean<InsuranceRequestType> {

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
}
