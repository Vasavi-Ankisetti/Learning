package com.java.sairamana.NewYearGift;
import java.util.Comparator;

public class SortByWeight implements Comparator<Sweets> {
	public int compare(Sweets g1,Sweets g2) {
		return g1.weightOfSweet-g2.weightOfSweet;
	}

}
