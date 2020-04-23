package com.Rakesh.Cart.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import com.Rakesh.Cart.Model.CartDetails;
import com.Rakesh.Cart.Model.ProductsDetails;
import com.Rakesh.Cart.Model.UserProdutId;
import com.Rakesh.Cart.Repository.Repo;


@Service
public class Services {
	
	@Autowired
	private Repo repo;
	
	@Value("${products.details.url}")
	String endPoint;

	@Autowired
	RestOperations restOpe;
	
	public Optional<CartDetails> addCart(UserProdutId upi) {
		List<List<Object>> l1 = new ArrayList<>();
		if (!repo.existsById(upi.geteMail())) {
			l1.add(Arrays.asList(upi.getpId(),upi.getQty()));
		}
		else {
			l1 = repo.findById(upi.geteMail()).get().getpList();
			l1.add(Arrays.asList(upi.getpId(),upi.getQty()));
		}
		repo.save(new CartDetails(upi.geteMail(),l1));
		return repo.findById(upi.geteMail());
	}
	
	public void editCart(UserProdutId upi){
		List<List<Object>> lcd = repo.findById(upi.geteMail()).get().getpList();
		for (List<Object> lob: lcd) {
			if (lob.get(0).equals(upi.getpId()))
				lob.set(1, upi.getQty());
		}
		repo.save(new CartDetails(upi.geteMail(),lcd));
	}

	public List<ProductsDetails> usersCart(String email) {
		if (!repo.existsById(email))
			return null;
		List<List<Object>> l1 = repo.findById(email).get().getpList();
		List<ProductsDetails> pdl = new ArrayList<>();
		for (List<Object> lob:l1) {
			pdl.add(restOpe.getForObject(endPoint, ProductsDetails.class, lob.get(0)));
		}
		return pdl;
	}
	
	
}
