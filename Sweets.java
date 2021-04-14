package com.java.sairamana.NewYearGift;

public abstract class Sweets {
	protected abstract String getType();
	  int weightOfSweet,costOfSweet;
	  String nameOfSweet;
	  Sweets(String nameOfSweet,int weightOfSweet,int costOfSweet){
		  this.nameOfSweet = nameOfSweet;
		  this.weightOfSweet = weightOfSweet;
		  this.costOfSweet = costOfSweet;
	  }
	
}