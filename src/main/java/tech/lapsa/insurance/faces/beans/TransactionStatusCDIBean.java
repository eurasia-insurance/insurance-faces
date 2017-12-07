package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.TransactionStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.TransactionStatus;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("TransactionStatus")
@ApplicationScoped
public class TransactionStatusCDIBean implements ListingBean<TransactionStatus> {

    @Override
    public TransactionStatus[] getAll() {
	return values();
    }

    @Override
    public TransactionStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public TransactionStatus[] getNonSelectable() {
	return nonSelectableValues();
    }
}
