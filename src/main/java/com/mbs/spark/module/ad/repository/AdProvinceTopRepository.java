package com.mbs.spark.module.ad.repository;

import com.mbs.spark.module.ad.model.AdProvinceTop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Created by mobingsen on 2020/10/7 17:53
 */
public interface AdProvinceTopRepository extends JpaRepository<AdProvinceTop, Long> {

    @Query("DELETE FROM tb_ad_province_top t WHERE t.date=?1 AND t.province=?2")
    void deleteByDateAndProvince(String date, String province);
}
