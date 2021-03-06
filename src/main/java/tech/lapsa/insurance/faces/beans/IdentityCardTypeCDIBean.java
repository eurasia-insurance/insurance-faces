package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.IdentityCardType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.IdentityCardType;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("IdentityCardType")
@ApplicationScoped
public class IdentityCardTypeCDIBean implements ListingBean<IdentityCardType> {

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

    @Override
    public IdentityCardType byName(String name) {
	return IdentityCardType.valueOf(name);
    }
}
