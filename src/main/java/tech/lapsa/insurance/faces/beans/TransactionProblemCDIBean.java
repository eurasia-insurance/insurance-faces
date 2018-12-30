package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.TransactionProblem.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.TransactionProblem;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("TransactionProblem")
@ApplicationScoped
public class TransactionProblemCDIBean implements ListingBean<TransactionProblem> {

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

    @Override
    public TransactionProblem byName(String name) {
	return TransactionProblem.valueOf(name);
    }
}
