package com.rga.my.shop.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rga.my.shop.integration.entities.Sell;

public interface SellRepository extends JpaRepository<Sell, Long> {
}
