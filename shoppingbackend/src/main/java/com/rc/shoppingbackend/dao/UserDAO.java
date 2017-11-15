package com.rc.shoppingbackend.dao;

import java.util.List;

import com.rc.shoppingbackend.dto.Address;
import com.rc.shoppingbackend.dto.Cart;
import com.rc.shoppingbackend.dto.User;

public interface UserDAO {

	boolean add(User user);
	User getByEmail(String email);
	boolean updateCart(Cart cart);
	boolean addAddress(Address address);
	boolean updateAddress(Address address);
	
	/*Address getBillingAddress(User user);
	List<Address> listShippingAddresses(User user);*/
	User get(int id);
	// adding and updating a new address
	Address getAddress(int addressId);
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	

}
