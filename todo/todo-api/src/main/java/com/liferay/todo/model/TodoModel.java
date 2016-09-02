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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Todo service. Represents a row in the &quot;todo_Todo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.todo.model.impl.TodoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.todo.model.impl.TodoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Todo
 * @see com.liferay.todo.model.impl.TodoImpl
 * @see com.liferay.todo.model.impl.TodoModelImpl
 * @generated
 */
@ProviderType
public interface TodoModel extends BaseModel<Todo>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a todo model instance should use the {@link Todo} interface instead.
	 */

	/**
	 * Returns the primary key of this todo.
	 *
	 * @return the primary key of this todo
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this todo.
	 *
	 * @param primaryKey the primary key of this todo
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this todo.
	 *
	 * @return the uuid of this todo
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this todo.
	 *
	 * @param uuid the uuid of this todo
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the todo ID of this todo.
	 *
	 * @return the todo ID of this todo
	 */
	public long getTodoId();

	/**
	 * Sets the todo ID of this todo.
	 *
	 * @param todoId the todo ID of this todo
	 */
	public void setTodoId(long todoId);

	/**
	 * Returns the group ID of this todo.
	 *
	 * @return the group ID of this todo
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this todo.
	 *
	 * @param groupId the group ID of this todo
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this todo.
	 *
	 * @return the company ID of this todo
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this todo.
	 *
	 * @param companyId the company ID of this todo
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this todo.
	 *
	 * @return the user ID of this todo
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this todo.
	 *
	 * @param userId the user ID of this todo
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this todo.
	 *
	 * @return the user uuid of this todo
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this todo.
	 *
	 * @param userUuid the user uuid of this todo
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this todo.
	 *
	 * @return the user name of this todo
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this todo.
	 *
	 * @param userName the user name of this todo
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this todo.
	 *
	 * @return the create date of this todo
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this todo.
	 *
	 * @param createDate the create date of this todo
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this todo.
	 *
	 * @return the modified date of this todo
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this todo.
	 *
	 * @param modifiedDate the modified date of this todo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the description of this todo.
	 *
	 * @return the description of this todo
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this todo.
	 *
	 * @param description the description of this todo
	 */
	public void setDescription(String description);

	/**
	 * Returns the done of this todo.
	 *
	 * @return the done of this todo
	 */
	public boolean getDone();

	/**
	 * Returns <code>true</code> if this todo is done.
	 *
	 * @return <code>true</code> if this todo is done; <code>false</code> otherwise
	 */
	public boolean isDone();

	/**
	 * Sets whether this todo is done.
	 *
	 * @param done the done of this todo
	 */
	public void setDone(boolean done);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Todo todo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Todo> toCacheModel();

	@Override
	public Todo toEscapedModel();

	@Override
	public Todo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}