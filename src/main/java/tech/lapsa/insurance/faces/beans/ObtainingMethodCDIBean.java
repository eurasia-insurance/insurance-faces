package tech.lapsa.insurance.faces.beans;

import static com.lapsa.insurance.elements.ObtainingMethod.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.lapsa.insurance.elements.ObtainingMethod;

import tech.lapsa.javax.faces.commons.beans.localization.ListingBean;

@Named("ObtainingMethod")
@ApplicationScoped
public class ObtainingMethodCDIBean implements ListingBean<ObtainingMethod> {

    @Override
    public ObtainingMethod[] getAll() {
	return values();
    }

    @Override
    public ObtainingMethod[] getSelectable() {
	return selectableValues();
    }

    @Override
    public ObtainingMethod[] getNonSelectable() {
	return nonSelectableValues();
    }

    @Override
    public ObtainingMethod byName(String name) {
	return ObtainingMethod.valueOf(name);
    }
}
