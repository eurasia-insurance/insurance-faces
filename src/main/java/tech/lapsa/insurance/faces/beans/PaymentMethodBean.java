package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.PaymentMethod.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.PaymentMethod;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("PaymentMethod")
@ApplicationScoped
public class PaymentMethodBean implements ListingBean<PaymentMethod> {

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
