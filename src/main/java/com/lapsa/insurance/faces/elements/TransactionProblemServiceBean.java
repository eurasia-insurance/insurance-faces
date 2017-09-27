package com.lapsa.insurance.faces.elements;

import static com.lapsa.insurance.elements.TransactionProblem.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.faces.services.FacesSelectItemListingService;
import com.lapsa.insurance.elements.TransactionProblem;

@Named("transactionProblemService")
@ApplicationScoped
public class TransactionProblemServiceBean
	implements FacesSelectItemListingService<TransactionProblem> {

    @Override
    public TransactionProblem[] getAll() {
	return values();
    }

    @Override
    public TransactionProblem[] getSelectable() {
	return selectableValues();
    }

    @Override
    public TransactionProblem[] getNonSelectable() {
	return nonSelectableValues();
    }
}
