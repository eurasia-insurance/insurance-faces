package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.CascoCarAgeClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.CascoCarAgeClass;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("CascoCarAgeClass")
@ApplicationScoped
public class CascoCarAgeClassBean implements ListingBean<CascoCarAgeClass> {

    @Override
    public CascoCarAgeClass[] getAll() {
	return values();
    }

    @Override
    public CascoCarAgeClass[] getSelectable() {
	return selectableValues();
    }

    @Override
    public CascoCarAgeClass[] getNonSelectable() {
	return nonSelectableValues();
    }
}
