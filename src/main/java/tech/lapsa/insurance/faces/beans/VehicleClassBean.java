package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.VehicleClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.VehicleClass;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("VehicleClass")
@ApplicationScoped
public class VehicleClassBean implements ListingBean<VehicleClass> {

    @Override
    public VehicleClass[] getAll() {
	return values();
    }

    @Override
    public VehicleClass[] getSelectable() {
	return selectableValues();
    }

    @Override
    public VehicleClass[] getNonSelectable() {
	return nonSelectableValues();
    }

    public VehicleClass[] getValidForMotorTPL() {
	return VehicleClass.validForMotorTPLValues();
    }
}
