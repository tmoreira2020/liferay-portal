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

package com.liferay.portal.verify.audited.model;

import com.liferay.portal.verify.VerifiableAuditedModel;

/**
 * @author Miguel Pastor
 */

public class MBThreadFlagVerifiableAuditedModel
	implements VerifiableAuditedModel {

	@Override
	public String getJoinByColumnName() {
		return "userId";
	}

	@Override
	public String getModelName() {
		return "MBThreadFlag";
	}

	@Override
	public String getPkColumnName() {
		return "threadFlagId";
	}

	@Override
	public String getRelatedModelName() {
		return "User_";
	}

	@Override
	public String getRelatedPKColumnName() {
		return "userId";
	}

	@Override
	public boolean isUpdateDates() {
		return true;
	}

}