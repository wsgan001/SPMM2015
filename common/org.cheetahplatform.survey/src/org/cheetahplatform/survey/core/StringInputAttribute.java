package org.cheetahplatform.survey.core;

import org.cheetahplatform.survey.core.validator.IAttributeValidator;
import org.cheetahplatform.survey.core.validator.NonEmptyInputValidator;

/**
 * @author Jakob Pinggera <Jakob.Pinggera@uibk.ac.at>
 * 
 *         23.09.2009
 */
public class StringInputAttribute extends TextInputAttribute {

	/**
	 * The no args constructor is needed for automatic XStream deserialization
	 */
	public StringInputAttribute() {
		this("", false); //$NON-NLS-1$
	}

	public StringInputAttribute(String name, boolean mandatory) {
		super(name, mandatory);
	}

	@Override
	public String getType() {
		return "Text"; //$NON-NLS-1$
	}

	@Override
	public IAttributeValidator getValidator() {
		return new NonEmptyInputValidator(getName());
	}
}
