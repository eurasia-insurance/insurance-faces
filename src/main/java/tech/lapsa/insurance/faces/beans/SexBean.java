package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.Sex.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.Sex;

import tech.lapsa.javax.faces.beans.localization.ListingBean;

@Named("Sex")
@ApplicationScoped
public class SexBean implements ListingBean<Sex> {

    @Override
    public Sex[] getAll() {
	return values();
    }

    @Override
    public Sex[] getSelectable() {
	return selectableValues();
    }

    @Override
    public Sex[] getNonSelectable() {
	return nonSelectableValues();
    }
}
