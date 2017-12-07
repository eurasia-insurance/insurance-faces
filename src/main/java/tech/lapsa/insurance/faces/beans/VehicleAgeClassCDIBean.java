package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.VehicleAgeClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.VehicleAgeClass;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("VehicleAgeClass")
@ApplicationScoped
public class VehicleAgeClassCDIBean implements ListingBean<VehicleAgeClass> {

    @Override
    public VehicleAgeClass[] getAll() {
	return values();
    }

    @Override
    public VehicleAgeClass[] getSelectable() {
	return selectableValues();
    }

    @Override
    public VehicleAgeClass[] getNonSelectable() {
	return nonSelectableValues();
    }
}
