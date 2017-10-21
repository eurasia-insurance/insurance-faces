package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.ProgressStatus.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.ProgressStatus;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("ProgressStatus")
@ApplicationScoped
public class ProgressStatusBean implements ListingBean<ProgressStatus> {

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
}
