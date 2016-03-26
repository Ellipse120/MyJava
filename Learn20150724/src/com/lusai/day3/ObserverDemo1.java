package com.lusai.day3;

public class ObserverDemo1 {
	public static void main(String[] args) {
		
		House h = new House(10000);
		HousePriceObserver hpo1 = new HousePriceObserver("A");
		HousePriceObserver hpo2 = new HousePriceObserver("B");
		HousePriceObserver hpo3 = new HousePriceObserver("C");
		h.addObserver(hpo1);
		h.addObserver(hpo2);
		h.addObserver(hpo3);
		System.out.println(h);
		h.setPrice(33333);
		System.out.println(h);
		
	}
}
