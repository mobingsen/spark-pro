package com.mbs.spark.module.ad.repository;

import com.mbs.spark.module.ad.model.AdBlacklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Created by mobingsen on 2020/10/7 14:42
 */
public interface AdBlackListRepository extends JpaRepository<AdBlacklist, Long> {
}
