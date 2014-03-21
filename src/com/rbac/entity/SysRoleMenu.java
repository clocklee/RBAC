package com.rbac.entity;

import java.util.Date;

/**
 * SysRoleMenu generated by MyEclipse Persistence Tools
 */

public class SysRoleMenu implements java.io.Serializable {

	// Fields

	private Long id;

	private SysRole sysRole;

	private SysMenu sysMenu;

	private Integer isDeleted;

	private Long creatorId;

	private Date createTime;

	private Long modifierId;

	private Date modifyTime;

	// Constructors

	/** default constructor */
	public SysRoleMenu() {
	}

	/** minimal constructor */
	public SysRoleMenu(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	/** full constructor */
	public SysRoleMenu(SysRole sysRole, SysMenu sysMenu, Integer isDeleted,
			Long creatorId, Date createTime, Long modifierId, Date modifyTime) {
		this.sysRole = sysRole;
		this.sysMenu = sysMenu;
		this.isDeleted = isDeleted;
		this.creatorId = creatorId;
		this.createTime = createTime;
		this.modifierId = modifierId;
		this.modifyTime = modifyTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SysRole getSysRole() {
		return this.sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

	public SysMenu getSysMenu() {
		return this.sysMenu;
	}

	public void setSysMenu(SysMenu sysMenu) {
		this.sysMenu = sysMenu;
	}

	public Integer getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Long getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getModifierId() {
		return this.modifierId;
	}

	public void setModifierId(Long modifierId) {
		this.modifierId = modifierId;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}