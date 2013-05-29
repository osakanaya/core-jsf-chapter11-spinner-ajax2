package com.corejsf;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIInput;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.faces.convert.IntegerConverter;

@FacesComponent("com.corejsf.FontSpinner")
public class UIFontSpinner extends UIInput implements ClientBehaviorHolder {
	private static List<String> eventNames = Arrays.asList("click");
	
	public UIFontSpinner() {
		setConverter(new IntegerConverter());
		setRendererType("com.corejsf.FontSpinner");
	}

	@Override
	public String getDefaultEventName() {
		return "click";
	}

	@Override
	public Collection<String> getEventNames() {
		return eventNames;
	}
}
