package com.mbs.spark.module.session.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.spark.sql.Row;

import javax.persistence.Entity;

/**
 * Session明细
 */
@Getter
@Setter
@Entity
public class SessionDetail {

	private long taskId;
	private long userId;
	private String sessionId;
	private long pageId;
	private String actionTime;
	private String searchKeyword;
	private long clickCategoryId;
	private long clickProductId;
	private String orderCategoryIds;
	private String orderProductIds;
	private String payCategoryIds;
	private String payProductIds;

	public static SessionDetail ctor(long taskId, Row row) {
		SessionDetail sessionDetail = new SessionDetail();
		sessionDetail.setTaskId(taskId);
		sessionDetail.setUserId(row.getLong(1));
		sessionDetail.setSessionId(row.getString(2));
		sessionDetail.setPageId(row.getLong(3));
		sessionDetail.setActionTime(row.getString(4));
		sessionDetail.setSearchKeyword(row.getString(5));
		sessionDetail.setClickCategoryId(row.getLong(6));
		sessionDetail.setClickProductId(row.getLong(7));
		sessionDetail.setOrderCategoryIds(row.getString(8));
		sessionDetail.setOrderProductIds(row.getString(9));
		sessionDetail.setPayCategoryIds(row.getString(10));
		sessionDetail.setPayProductIds(row.getString(11));
		return sessionDetail;
	}
}