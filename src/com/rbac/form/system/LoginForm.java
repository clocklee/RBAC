/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.rbac.form.system;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.rbac.common.BaseForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-20-2013
 * 
 * XDoclet definition:
 * @struts.form name="LoginForm"
 */
public class LoginForm extends BaseForm {
	/*
	 * Generated fields
	 */

	/** password property */
	private String password;

	/** submit property */
	private String submit;

	/** username property */
	private String username;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the password.
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Set the password.
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	 * Returns the submit.
	 * @return String
	 */
	public String getSubmit() {
		return submit;
	}

	/** 
	 * Set the submit.
	 * @param submit The submit to set
	 */
	public void setSubmit(String submit) {
		this.submit = submit;
	}

	/** 
	 * Returns the username.
	 * @return String
	 */
	public String getUsername() {
		return username;
	}

	/** 
	 * Set the username.
	 * @param username The username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
}