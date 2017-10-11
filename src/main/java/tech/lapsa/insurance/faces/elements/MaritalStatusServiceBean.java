package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.MaritalStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.MaritalStatus;

@Named("maritalStatusService")
@ApplicationScoped
public class MaritalStatusServiceBean implements FacesSelectItemListingService<MaritalStatus> {

    @Override
    public MaritalStatus[] getAll() {
	return values();
    }

    @Override
    public MaritalStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public MaritalStatus[] getNonSelectable() {
	return nonSelectableValues();
    }
}
