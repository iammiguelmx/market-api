package com.platzi.market.domain.service;

import com.platzi.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface IPurchaseService {

    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);

}
