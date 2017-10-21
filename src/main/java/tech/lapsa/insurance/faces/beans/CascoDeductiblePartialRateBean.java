package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.CascoDeductiblePartialRate.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.CascoDeductiblePartialRate;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("CascoDeductiblePartialRate")
@ApplicationScoped
public class CascoDeductiblePartialRateBean
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
}
