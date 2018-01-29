package com.vd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.connect.DBConnet;

import org.apache.struts.action.ActionForward;

public class Module extends org.apache.struts.action.Action {
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	Connection conn = null;
	PreparedStatement pt = null;
	DBConnet kn = new DBConnet();

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Controller loginForm = (Controller) form;
		conn = kn.Ketnoi();
		String sql = "select * from user ";

		pt = conn.prepareStatement(sql);
		ResultSet rs = pt.executeQuery();
		while (rs.next()) {
			String name = rs.getString("name");
			int tuoi = rs.getInt("pass");

			if (loginForm.getUserName().equals(name) && loginForm.getTuoi() == tuoi) {
				return mapping.findForward(SUCCESS);
			} else {
				return mapping.findForward(FAILURE);
			}

		}
		rs.close();
		pt.close();
		return null;

	}

}
