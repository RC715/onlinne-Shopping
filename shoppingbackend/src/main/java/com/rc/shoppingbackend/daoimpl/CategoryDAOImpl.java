package com.rc.shoppingbackend.daoimpl;


import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rc.shoppingbackend.dao.CategoryDAO;
import com.rc.shoppingbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{

	private static List<Category> categories=new ArrayList<>();
	
	static {
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("desc for tv");
		category.setImageURL("abc");
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("Mob");
		category.setDescription("desc for Mob");
		category.setImageURL("abc");
		categories.add(category);
		
		category=new Category();
		category.setId(3);
		category.setName("Lappy");
		category.setDescription("desc for Lappy");
		category.setImageURL("abc");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		
		
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category:categories) {
			if(category.getId()==id)
				return category;
		}
		return null;
	}

}
