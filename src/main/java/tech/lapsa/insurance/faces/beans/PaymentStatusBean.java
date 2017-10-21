package tech.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.PaymentStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.PaymentStatus;

@Named("paymentStatusService")
@ApplicationScoped
public class PaymentStatusServiceBean implements FacesSelectItemListingService<PaymentStatus> {

    @Override
    public PaymentStatus[] getAll() {
	return values();
    }

    @Override
    public PaymentStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public PaymentStatus[] getNonSelectable() {
	return nonSelectableValues();
    }
}
