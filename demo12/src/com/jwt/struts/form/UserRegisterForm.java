package com.jwt.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserRegisterForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String name;
	private String pass;
	

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (name == null || name.length() < 1) {
			errors.add("firstName", new ActionMessage(
					"error.firstName.required"));

		}
		
		if (pass == null || pass.length() < 1) {
			errors.add("phone", new ActionMessage("error.phone.required"));

		}
		return errors;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
