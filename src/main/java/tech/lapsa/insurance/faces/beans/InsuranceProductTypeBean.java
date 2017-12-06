package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuranceProductType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuranceProductType;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("InsuranceProductType")
@ApplicationScoped
public class InsuranceProductTypeBean implements ListingBean<InsuranceProductType> {

    @Override
    public InsuranceProductType[] getAll() {
	return values();
    }

    @Override
    public InsuranceProductType[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuranceProductType[] getNonSelectable() {
	return nonSelectableValues();
    }
}
