package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.ProgressStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.ProgressStatus;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("ProgressStatus")
@ApplicationScoped
public class ProgressStatusCDIBean implements ListingBean<ProgressStatus> {

    @Override
    public ProgressStatus[] getAll() {
	return values();
    }

    @Override
    public ProgressStatus[] getSelectable() {
	return selectableValues();
    }

    @Override
    public ProgressStatus[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public ProgressStatus byName(String name) {
	return ProgressStatus.valueOf(name);
    }
}
