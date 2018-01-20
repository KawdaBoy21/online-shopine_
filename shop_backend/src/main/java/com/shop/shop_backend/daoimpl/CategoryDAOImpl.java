package com.shop.shop_backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shop.shop_backend.dao.CategoryDAO;
import com.shop.shop_backend.dto.Categoty;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Categoty> categories = new ArrayList<>();
	
	static {
		// adding first category
		Categoty cat = new Categoty();
		cat.setId(1);
		cat.setName("Mobile Phones");
		cat.setDiscription("Test Mobile Phones");
		cat.setImageURL("SDS/SDs/Sjsdghf");
		categories.add(cat);
		
		// 2nd category
		cat = new Categoty();
		cat.setId(2);
		cat.setName("Televition");
		cat.setDiscription("Test test asdsad");
		cat.setImageURL("SDS/SDs/sandsad");
		categories.add(cat);
		
		//3rd
		
		cat = new Categoty();
		cat.setId(3);
		cat.setName("Fans");
		cat.setDiscription("Test Fan");
		cat.setImageURL("SDS/SDs/asknfdsfnsdfn");
		categories.add(cat);
	}

	@Override
	public List<Categoty> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Categoty get(int id) {
		//enhanced for loop
		
		for(Categoty cat:categories) {
			if(cat.getId()==id) return cat;
		}
		return null;
	}

}
