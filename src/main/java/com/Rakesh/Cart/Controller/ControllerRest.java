package com.Rakesh.Cart.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rakesh.Cart.Model.CartDetails;
import com.Rakesh.Cart.Model.ProductsDetails;
import com.Rakesh.Cart.Model.UserProdutId;
import com.Rakesh.Cart.Service.Services;

@RestController
@RequestMapping("/cart")
//@CrossOrigin(origins = "http://localhost:3000")
public class ControllerRest {
	
	@Autowired
	private Services services;
	
	@PostMapping("/add")
	public Optional<CartDetails> addCart(@RequestBody UserProdutId upi) {
		return services.addCart(upi);
	}
	
	@PutMapping("/edit")
	public void editCart(@RequestBody UserProdutId upi){
		services.editCart(upi);
	}
	@GetMapping("/userscart/{email}")
	public List<ProductsDetails> usersCart(@PathVariable ("email") String email){
		return services.usersCart(email);
	}
	
	
}
