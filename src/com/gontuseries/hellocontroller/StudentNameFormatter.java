package com.gontuseries.hellocontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameFormatter extends PropertyEditorSupport {
	@Override
	public void setAsText(String sName) throws IllegalArgumentException {
		if (sName.contains("Mr.") || sName.contains("Ms.")) {
			setValue(sName);
		} else {
			sName = "Mr." + sName;
			setValue(sName);
		}

	}

}
