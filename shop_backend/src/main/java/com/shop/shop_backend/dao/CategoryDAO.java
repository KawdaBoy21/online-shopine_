package com.shop.shop_backend.dao;

import java.util.List;

import com.shop.shop_backend.dto.Categoty;


public interface CategoryDAO {
  
	 List<Categoty> list();
	 Categoty get(int id);
}
