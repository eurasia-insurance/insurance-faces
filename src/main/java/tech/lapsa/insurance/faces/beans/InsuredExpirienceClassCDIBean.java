package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.InsuredExpirienceClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.InsuredExpirienceClass;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("InsuredExpirienceClass")
@ApplicationScoped
public class InsuredExpirienceClassCDIBean implements ListingBean<InsuredExpirienceClass> {

    @Override
    public InsuredExpirienceClass[] getAll() {
	return values();
    }

    @Override
    public InsuredExpirienceClass[] getSelectable() {
	return selectableValues();
    }

    @Override
    public InsuredExpirienceClass[] getNonSelectable() {
	return nonSelectableValues();
    }
}
