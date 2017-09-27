package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.PaymentMethod.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.PaymentMethod;

@Named("paymentMethodService")
@ApplicationScoped
public class PaymentMethodServiceBean implements FacesSelectItemListingService<PaymentMethod> {

    @Override
    public PaymentMethod[] getAll() {
	return values();
    }

    @Override
    public PaymentMethod[] getSelectable() {
	return selectableValues();
    }

    @Override
    public PaymentMethod[] getNonSelectable() {
	return nonSelectableValues();
    }
}
