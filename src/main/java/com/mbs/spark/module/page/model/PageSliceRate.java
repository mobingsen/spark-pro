package com.mbs.spark.module.page.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 * 页面切片转化率
 */
@Getter
@Setter
@Entity(name = "tb_page_slice_rate")
public class PageSliceRate {

	@Id
	@TableGenerator(name = "IdGen", table = "tb_gen", allocationSize = 1)
	@GeneratedValue(generator = "IdGen")
	private Long id;
	private long taskId;
	private String rate;
}
