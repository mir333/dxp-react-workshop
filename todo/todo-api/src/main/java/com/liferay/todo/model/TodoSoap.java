/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.todo.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.todo.service.http.TodoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.todo.service.http.TodoServiceSoap
 * @generated
 */
@ProviderType
public class TodoSoap implements Serializable {
	public static TodoSoap toSoapModel(Todo model) {
		TodoSoap soapModel = new TodoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTodoId(model.getTodoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDescription(model.getDescription());
		soapModel.setDone(model.getDone());

		return soapModel;
	}

	public static TodoSoap[] toSoapModels(Todo[] models) {
		TodoSoap[] soapModels = new TodoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TodoSoap[][] toSoapModels(Todo[][] models) {
		TodoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TodoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TodoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TodoSoap[] toSoapModels(List<Todo> models) {
		List<TodoSoap> soapModels = new ArrayList<TodoSoap>(models.size());

		for (Todo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TodoSoap[soapModels.size()]);
	}

	public TodoSoap() {
	}

	public long getPrimaryKey() {
		return _todoId;
	}

	public void setPrimaryKey(long pk) {
		setTodoId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTodoId() {
		return _todoId;
	}

	public void setTodoId(long todoId) {
		_todoId = todoId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public boolean getDone() {
		return _done;
	}

	public boolean isDone() {
		return _done;
	}

	public void setDone(boolean done) {
		_done = done;
	}

	private String _uuid;
	private long _todoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _description;
	private boolean _done;
}