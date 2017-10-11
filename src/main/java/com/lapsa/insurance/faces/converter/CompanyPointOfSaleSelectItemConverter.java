package com.lapsa.insurance.faces.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

import org.omnifaces.converter.SelectItemsConverter;

import com.lapsa.insurance.domain.CompanyPointOfSale;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.java.commons.function.MyOptionals;
import tech.lapsa.java.commons.function.MyPredicates;

@FacesConverter(forClass = CompanyPointOfSale.class)
public class CompanyPointOfSaleSelectItemConverter extends SelectItemsConverter {

    @Override
    public String getAsString(FacesContext context, UIComponent component,
	    Object value) {

	return MyOptionals.of(value) //
		.filter(MyPredicates.isA(CompanyPointOfSale.class))
		.map(MyObjects.cast(CompanyPointOfSale.class)) //
		.map(CompanyPointOfSale::getId) //
		.map(String::valueOf) //
		.orElse(null);
    }

}
