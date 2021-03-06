/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.rbac.form.system;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.rbac.common.BaseForm;
import com.rbac.entity.SysAction;
import com.rbac.service.ActionService;
import com.rbac.util.CommonUtils;

/**
 * MyEclipse Struts Creation date: 04-30-2014
 * 
 * XDoclet definition:
 * 
 * @struts.form name="actionModifyForm"
 */
public class ActionModifyForm extends BaseForm {

	private String submit;

	private String name;

	private String url;

	private String id;

	/**
	 * Method validate
	 * 
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
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.submit = null;

		// 编辑功能的反绑数据
		if (CommonUtils.isNotBlank(request.getParameter("id"))) {
			this.setId(request.getParameter("id"));
			ActionService actionService = (ActionService) super
					.getBean("actionService");
			Long id = Long.parseLong(this.getId());
			SysAction action = actionService.getActionById(id);
			if (action != null) {
				this.setName(action.getName());
				this.setUrl(action.getUrl());
			}
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}