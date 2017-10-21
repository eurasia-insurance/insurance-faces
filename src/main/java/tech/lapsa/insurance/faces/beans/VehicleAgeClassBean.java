package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.VehicleAgeClass.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.VehicleAgeClass;

@Named("vehicleAgeClassService")
@ApplicationScoped
public class VehicleAgeClassServiceBean implements FacesSelectItemListingService<VehicleAgeClass> {

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
