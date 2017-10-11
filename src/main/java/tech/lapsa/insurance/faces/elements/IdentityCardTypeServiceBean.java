package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.IdentityCardType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.IdentityCardType;

@Named("identityCardTypeService")
@ApplicationScoped
public class IdentityCardTypeServiceBean implements FacesSelectItemListingService<IdentityCardType> {

    @Override
    public IdentityCardType[] getAll() {
	return values();
    }

    @Override
    public IdentityCardType[] getSelectable() {
	return selectableValues();
    }

    @Override
    public IdentityCardType[] getNonSelectable() {
	return nonSelectableValues();
    }
}
