package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.PolicyTemporaryEntryTimeCategory.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.PolicyTemporaryEntryTimeCategory;

@Named("policyTemporaryEntryTimeCategoryService")
@ApplicationScoped
public class PolicyTemporaryEntryTimeCategoryServiceBean
	implements FacesSelectItemListingService<PolicyTemporaryEntryTimeCategory> {

    @Override
    public PolicyTemporaryEntryTimeCategory[] getAll() {
	return values();
    }

    @Override
    public PolicyTemporaryEntryTimeCategory[] getSelectable() {
	return selectableValues();
    }

    @Override
    public PolicyTemporaryEntryTimeCategory[] getNonSelectable() {
	return nonSelectableValues();
    }
}
