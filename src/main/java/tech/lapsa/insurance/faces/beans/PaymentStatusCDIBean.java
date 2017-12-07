package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.PaymentStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.PaymentStatus;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("PaymentStatus")
@ApplicationScoped
public class PaymentStatusBean implements ListingBean<PaymentStatus> {

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
