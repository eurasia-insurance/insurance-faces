package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.InsuranceRequestType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.InsuranceRequestType;

@Named("insuranceRequestTypeService")
@ApplicationScoped
public class InsuranceRequestTypeServiceBean implements FacesSelectItemListingService<InsuranceRequestType> {

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
