package com.rc.shoppingbackend.test;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rc.shoppingbackend.dao.UserDAO;
import com.rc.shoppingbackend.dto.Address;
import com.rc.shoppingbackend.dto.Cart;
import com.rc.shoppingbackend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Cart cart = null;
	private Address address = null;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.rc.shoppingbackend");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	
/*	@Test
	public void testAddUser() {
		
		user = new User() ;
		user.setFirstName("Hrithik");
		user.setLastName("Roshan");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("CUSTOMER");
		user.setEnabled(true);
		user.setPassword("12345");
		
		
		address = new Address();
		address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabil Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
		
		cart = new Cart();
		
		// linked the address with the user
		address.setUserId(user.getId());
		
		// linked the cart with the user
		cart.setUser(user);
		// link the user with the cart
		user.setCart(cart);
		
		// add the user
		assertEquals("Failed to add the user!", true, userDAO.add(user));	
		// add the address
		assertEquals("Failed to add the billing address!", true, userDAO.addAddress(address));

				
		// add the shipping address
		address = new Address();
		address.setAddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
		address.setAddressLineTwo("Near Kudrat Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setShipping(true);
		address.setUserId(user.getId());
		assertEquals("Failed to add the shipping address!", true, userDAO.addAddress(address));
		
	}*/

	/*@Test
	public void testAddUser() {
		
		user = new User() ;
		user.setFirstName("Hrithik");
		user.setLastName("Roshan");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("CUSTOMER");
		user.setPassword("12345");
	
		
		if(user.getRole().equals("CUSTOMER")) {
			cart = new Cart();
			cart.setUser(user);
			user.setCart(cart);
		}
		// add the user
		assertEquals("Failed to add the user!", true, userDAO.add(user));
		
	}*/
	/*@Test
	public void testUpdateCart() {
		user = userDAO.getByEmail("hr@gmail.com");
		cart = user.getCart();
		cart.setGrandTotal(10000);
		cart.setCartLines(1);
		assertEquals("Failed to update the cart!", true, userDAO.updateCart(cart));			
	}*/
	/*
	@Test
	public void testAddAddress() {
		user = new User() ;
		user.setFirstName("Hrithik");
		user.setLastName("Roshan");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("CUSTOMER");
		user.setEnabled(true);
		user.setPassword("12345");
		
		assertEquals("Failed to add the user!", true, userDAO.add(user));
		
		address = new Address();
		address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabil Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
				
		address.setUser(user);
		// add the address
		assertEquals("Failed to add the address!", true, userDAO.addAddress(address));	
		
		address = new Address();
		address.setAddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
		address.setAddressLineTwo("Near Kudrat Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setShipping(true);
		address.setUser(user);
		assertEquals("Failed to add the shipping address!", true, userDAO.addAddress(address));
		
		
	}*/
	
	/*@Test
	public void testAddAddress() {
		user = userDAO.getByEmail("hr@gmail.com");
		
		address = new Address();
		address.setAddressLineOne("301/B Jadoo Society, King Uncle Nagar");
		address.setAddressLineTwo("Near Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
				
		address.setUser(user);
		// add the address
		assertEquals("Failed to add the address!", true, userDAO.addAddress(address));	
	}*/

	@Test
	public void testGetAddress() {
		user = userDAO.getByEmail("hr@gmail.com");
		
		assertEquals("Failed to fetch the list of the address size doesnot match!", 2, userDAO.listShippingAddresses(user.getId()).size());
		assertEquals("Failed to fetch the list of the address size doesnot match!", "Mumbai", userDAO.getBillingAddress(user.getId()).getCity());
		
	
	}
	
	/*
	@Test
	public void testAddUser() {
		
		user = new User() ;
		user.setFirstName("Hrithik");
		user.setLastName("Roshan");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("CUSTOMER");
		user.setEnabled(true);
		user.setPassword("12345");
		
		
		address = new Address();
		address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
		address.setAddressLineTwo("Near Kaabil Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setBilling(true);
		
		cart = new Cart();
		
		// linked the address with the user
		address.setUser(user);
		
		// linked the cart with the user
		cart.setUser(user);
		// link the user with the cart
		user.setCart(cart);
		
		// add the user
		assertEquals("Failed to add the user!", true, userDAO.add(user));	
		// add the address
		assertEquals("Failed to add the billing address!", true, userDAO.addAddress(address));

				
		// add the shipping address
		address = new Address();
		address.setAddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
		address.setAddressLineTwo("Near Kudrat Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
		address.setUser(user);
		assertEquals("Failed to add the shipping address!", true, userDAO.addAddress(address));
		
	}
	
	*/

	// working for uni-directional
/*
	@Test
	public void testAddAddress() {
		user = userDAO.get(1);
		
		address = new Address();
		address.setAddressLineOne("301/B Jadoo Society, King Uncle Nagar");
		address.setAddressLineTwo("Near Store");
		address.setCity("Mumbai");
		address.setState("Maharashtra");
		address.setCountry("India");
		address.setPostalCode("400001");
				
		address.setUser(user);
		// add the address
		assertEquals("Failed to add the address!", true, userDAO.addAddress(address));	
	}
	
	@Test
	public void testUpdateCart() {
		user = userDAO.get(1);
		cart = user.getCart();
		cart.setGrandTotal(10000);
		cart.setCartLines(1);
		assertEquals("Failed to update the cart!", true, userDAO.updateCart(cart));			
	} 

*/
	
}
