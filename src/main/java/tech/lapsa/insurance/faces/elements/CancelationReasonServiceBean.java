package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.CancelationReason.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.CancelationReason;

@Named("cancelationReasonService")
@ApplicationScoped
public class CancelationReasonServiceBean implements FacesSelectItemListingService<CancelationReason> {

    @Override
    public CancelationReason[] getAll() {
	return values();
    }

    @Override
    public CancelationReason[] getSelectable() {
	return selectableValues();
    }

    @Override
    public CancelationReason[] getNonSelectable() {
	return nonSelectableValues();
    }
}
