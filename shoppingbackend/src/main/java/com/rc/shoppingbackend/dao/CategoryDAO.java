package com.rc.shoppingbackend.dao;

import java.util.List;

import com.rc.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}