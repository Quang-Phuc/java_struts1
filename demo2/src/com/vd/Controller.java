/**
 * 
 */
/**
 * @author Admin
 *
 */
package com.vd;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller extends org.apache.struts.action.ActionForm
{
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	private int tuoi;
	
	private String SUCCESS="success";
	public Controller() {
		super();

	}
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (userName == null || userName.length() < 1) {
			errors.add("userName", new ActionMessage("error.userName.required"));
			// TODO: add 'error.name.required' key to your resources
		}

		return errors;
	}

	




}
