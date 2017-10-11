package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.CascoDeductibleFullRate.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.CascoDeductibleFullRate;

@Named("cascoDeductibleFullRateService")
@ApplicationScoped
public class CascoDeductibleFullRateServiceBean implements FacesSelectItemListingService<CascoDeductibleFullRate> {

    @Override
    public CascoDeductibleFullRate[] getAll() {
	return values();
    }

    @Override
    public CascoDeductibleFullRate[] getSelectable() {
	return selectableValues();
    }

    @Override
    public CascoDeductibleFullRate[] getNonSelectable() {
	return nonSelectableValues();
    }
}
