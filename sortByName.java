package com.java.sairamana.NewYearGift;
import java.util.Comparator;

public class sortByName implements Comparator<Sweets> {
	public int compare(Sweets g1,Sweets g2) {
		return g1.nameOfSweet.compareTo(g2.nameOfSweet);
	}

}
