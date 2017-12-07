package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.DeliveryTimeSlot.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.DeliveryTimeSlot;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("DeliveryTimeSlot")
@ApplicationScoped
public class DeliveryTimeSlotCDIBean implements ListingBean<DeliveryTimeSlot> {

    @Override
    public DeliveryTimeSlot[] getAll() {
	return values();
    }

    @Override
    public DeliveryTimeSlot[] getSelectable() {
	return selectableValues();
    }

    @Override
    public DeliveryTimeSlot[] getNonSelectable() {
	return nonSelectableValues();
    }
}
