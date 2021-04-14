package com.java.sairamana.NewYearGift;

import com.java.neha.NewYearGift.Sweets;

public class Candy extends Sweets {
	Candy(String nameOfCandy, int weightOfCandy, int costOfCandy) {
		super(nameOfCandy, weightOfCandy, costOfCandy);
		// TODO Auto-generated constructor stub
	}

	protected String getType(){
    	  return "Candies";
      }
	
	

}
