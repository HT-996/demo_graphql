package com.test.repository;

import com.test.model.Coupons;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author HuTing
 * @Date 2020-03-20 18:07
 */
public interface CouponsRepo extends JpaRepository<Coupons, Long> {
}
