package com.vd;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
public class module extends org.apache.struts.action.Action {
	 private final static String SUCCESS = "success";
	    private final static String FAILURE = "failure";
	    public ActionForward execute(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	        Controller loginForm = (Controller) form;
	        if (loginForm.getUserName().equals(loginForm.getPassword())) {
	            return mapping.findForward(SUCCESS);
	        } else {
	            return mapping.findForward(FAILURE);
	        }
	    }

}
