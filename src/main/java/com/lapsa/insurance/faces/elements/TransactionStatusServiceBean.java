package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.TransactionStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.TransactionStatus;

@Named("transactionStatusService")
@ApplicationScoped
public class TransactionStatusServiceBean
	implements FacesSelectItemListingService<TransactionStatus> {

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
