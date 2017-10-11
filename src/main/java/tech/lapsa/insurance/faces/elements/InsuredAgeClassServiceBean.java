package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.InsuredAgeClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.InsuredAgeClass;

@Named("insuredAgeClassService")
@ApplicationScoped
public class InsuredAgeClassServiceBean implements FacesSelectItemListingService<InsuredAgeClass> {

    @Override
    public InsuredAgeClass[] getAll() {
	return values();
    }

    @Override
    public InsuredAgeClass[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuredAgeClass[] getNonSelectable() {
	return nonSelectableValues();
    }
}
