package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.PolicyTemporaryEntryTimeCategory.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.PolicyTemporaryEntryTimeCategory;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("PolicyTemporaryEntryTimeCategory")
@ApplicationScoped
public class PolicyTemporaryEntryTimeCategoryBean implements ListingBean<PolicyTemporaryEntryTimeCategory> {

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
