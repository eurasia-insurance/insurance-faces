package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.InsuranceClassType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.InsuranceClassType;

@Named("insuranceClassTypeService")
@ApplicationScoped
public class InsuranceClassTypeServiceBean
	implements FacesSelectItemListingService<InsuranceClassType> {

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
