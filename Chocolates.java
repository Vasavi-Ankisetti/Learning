package com.java.sairamana.NewYearGift;

import com.java.neha.NewYearGift.Sweets;

public class Chocolates extends Sweets {
	Chocolates(String nameOfChocolate, int weightOfChocolate, int costOfChocolate) {
		super(nameOfChocolate, weightOfChocolate, costOfChocolate);
		// TODO Auto-generated constructor stub
	}

	protected String getType(){
  	  return "Chocolates";
    }
	

}
