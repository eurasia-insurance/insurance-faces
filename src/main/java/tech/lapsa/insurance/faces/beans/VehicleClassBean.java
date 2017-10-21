package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.VehicleClass.*;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.VehicleClass;

@Named("vehicleClassService")
@ApplicationScoped
public class VehicleClassServiceBean implements FacesSelectItemListingService<VehicleClass> {

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

    //

    public List<SelectItem> getValidForMotorTPLSI() {
	return generateItemsSI(this::getValidForMotorTPL, this::selectItem);
    }

    public List<SelectItem> getValidForMotorTPLShortSI() {
	return generateItemsSI(this::getValidForMotorTPL, this::selectItemShort);
    }

    public List<SelectItem> getgetValidForMotorTPLFullSI() {
	return generateItemsSI(this::getValidForMotorTPL, this::selectItemFull);
    }

}
