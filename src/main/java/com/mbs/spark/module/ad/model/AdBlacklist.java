package com.mbs.spark.module.ad.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 * 广告黑名单
 */
@Getter
@Setter
@Entity(name = "tb_ad_black_list")
public class AdBlacklist {

	@Id
	@TableGenerator(name = "IdGen", table = "tb_gen", allocationSize = 1)
	@GeneratedValue(generator = "IdGen")
	private Long id;
	private long userId;

	public static AdBlacklist ctor(long userId) {
		AdBlacklist blacklist = new AdBlacklist();
		blacklist.setUserId(userId);
		return blacklist;
	}
}
