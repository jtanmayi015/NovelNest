package com.app.service;

import java.util.List;

import com.app.Entity.Seller;

public interface SellerService {
	 List<Seller> getAllSellers();

	 Seller getSellerById(Long id);

	 Seller saveSeller(Seller seller);

	 void deleteSeller(Long id);
}
