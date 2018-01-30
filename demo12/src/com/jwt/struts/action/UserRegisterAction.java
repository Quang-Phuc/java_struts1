package com.jwt.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.jwt.struts.dao.UserRegisterDAO;
import com.jwt.struts.form.UserRegisterForm;

public class UserRegisterAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HttpSession ses = request.getSession(true);

		UserRegisterForm registerForm = (UserRegisterForm) form;
		String name = registerForm.getName();
		String pass = registerForm.getPass();
		
		UserRegisterDAO dao = new UserRegisterDAO();
		dao.insertData(name, pass);
		ses.setAttribute("name",name);
		ses.setAttribute("pass", pass);
		
		if (name.equals("") || pass.equals("")) {
			return mapping.findForward("error");
		}
		return mapping.findForward("success");

	}
}
