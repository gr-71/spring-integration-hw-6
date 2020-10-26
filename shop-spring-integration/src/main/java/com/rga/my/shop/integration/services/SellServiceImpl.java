package com.rga.my.shop.integration.services;

import org.springframework.stereotype.Service;
import com.rga.my.shop.integration.repositories.SellRepository;
import com.rga.my.shop.integration.entities.Sell;

import javax.transaction.Transactional;

@Service
public class SellServiceImpl implements SellService {
    private final SellRepository sellRepository;

    public SellServiceImpl(SellRepository sellRepository) {
        this.sellRepository = sellRepository;
    }

    @Override
    @Transactional
    public void save(Sell sell) {
        sellRepository.save(sell);
    }
}
