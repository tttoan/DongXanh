package com.home.model;

// Generated Feb 28, 2016 1:29:03 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

	private Integer roleId;
	private String roleName;
	private String roleDesc;
	private Integer isEnabled;
	private Set<User> users = new HashSet<User>(0);

	public Role() {
	}

	public Role(String roleName, String roleDesc, Integer isEnabled, Set<User> users) {
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.isEnabled = isEnabled;
		this.users = users;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public Integer getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Integer isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}