package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuranceClassType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuranceClassType;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("InsuranceClassType")
@ApplicationScoped
public class InsuranceClassTypeBean implements ListingBean<InsuranceClassType> {

    @Override
    public InsuranceClassType[] getAll() {
	return values();
    }

    @Override
    public InsuranceClassType[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuranceClassType[] getNonSelectable() {
	return nonSelectableValues();
    }
}
