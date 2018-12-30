package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.CascoDeductiblePartialRate.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.CascoDeductiblePartialRate;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("CascoDeductiblePartialRate")
@ApplicationScoped
public class CascoDeductiblePartialRateCDIBean
	implements ListingBean<CascoDeductiblePartialRate> {

    @Override
    public CascoDeductiblePartialRate[] getAll() {
	return values();
    }

    @Override
    public CascoDeductiblePartialRate[] getSelectable() {
	return selectableValues();
    }

    @Override
    public CascoDeductiblePartialRate[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public CascoDeductiblePartialRate byName(String name) {
	return CascoDeductiblePartialRate.valueOf(name);
    }
}
