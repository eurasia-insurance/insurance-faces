package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.SteeringWheelLocation.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.SteeringWheelLocation;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("SteeringWheelLocation")
@ApplicationScoped
public class SteeringWheelLocationCDIBean implements ListingBean<SteeringWheelLocation> {

    @Override
    public SteeringWheelLocation[] getAll() {
	return values();
    }

    @Override
    public SteeringWheelLocation[] getSelectable() {
	return selectableValues();
    }

    @Override
    public SteeringWheelLocation[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public SteeringWheelLocation byName(String name) {
	return SteeringWheelLocation.valueOf(name);
    }
}
