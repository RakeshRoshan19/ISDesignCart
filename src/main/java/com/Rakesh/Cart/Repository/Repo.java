package com.Rakesh.Cart.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Rakesh.Cart.Model.CartDetails;

public interface Repo extends CrudRepository<CartDetails, String> {


}
