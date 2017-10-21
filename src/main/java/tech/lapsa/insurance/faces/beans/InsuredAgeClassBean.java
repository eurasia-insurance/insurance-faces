package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuredAgeClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuredAgeClass;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("InsuredAgeClass")
@ApplicationScoped
public class InsuredAgeClassBean implements ListingBean<InsuredAgeClass> {

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
