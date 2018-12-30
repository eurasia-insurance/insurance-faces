package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.SubjectType.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.SubjectType;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("SubjectType")
@ApplicationScoped
public class SubjectTypeCDIBean implements ListingBean<SubjectType> {

    @Override
    public SubjectType[] getAll() {
	return values();
    }

    @Override
    public SubjectType[] getSelectable() {
	return selectableValues();
    }

    @Override
    public SubjectType[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public SubjectType byName(String name) {
	return SubjectType.valueOf(name);
    }
}
