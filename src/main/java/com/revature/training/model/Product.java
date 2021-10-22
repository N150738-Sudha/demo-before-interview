package com.revature.training.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Min(value = 200, message = "Please enter above {value}")
	private int productId;

	@Size(min = 5, max = 20, message = "Please enter between {min} and {max} characters.")
	private String productName;
	
	@Min(value = 1, message = "Please enter some quantity")
	private int quantityOnHand;

	@Min(value = 1, message = "Please enter price")
	private int price;

}
