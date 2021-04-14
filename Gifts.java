package com.java.sairamana.NewYearGift;
import java.util.*;

public class Gifts {
	 LinkedList<Sweets> sweet;
	   Gifts(LinkedList<Sweets> sweet){
		   this.sweet=sweet;
	   }
	   public Integer Weightssum() {
		   Integer sum=0;
		   for(Sweets s:sweet) {
			   sum+=s.weightOfSweet;
		   }
		   return sum;
	   }
	   public void sortChocolates(String sortparam) {
		        if(sortparam.compareTo("name")==0) {
		        	Collections.sort(sweet,new sortByName());
		        	
		        }
		        else if(sortparam.compareTo("weight")==0) {
		        	Collections.sort(sweet,new SortByWeight());
		        	
		        }
		        else if(sortparam.compareTo("cost")==0) {
		        	Collections.sort(sweet,new sortByCost());
		        }
	   }
	

}
