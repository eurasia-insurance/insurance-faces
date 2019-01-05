package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.ContractStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.ContractStatus;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("ContractStatus")
@ApplicationScoped
public class ContractStatusCDIBean implements ListingBean<ContractStatus> {

    @Override
    public ContractStatus[] getAll() {
	return values();
    }

    @Override
    public ContractStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public ContractStatus[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public ContractStatus byName(String name) {
	return ContractStatus.valueOf(name);
    }
}
