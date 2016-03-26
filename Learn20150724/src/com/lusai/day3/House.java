package com.lusai.day3;

import java.util.Observable;
import java.util.Observer;

public class House extends Observable{
	private double price;
	
	public House(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		super.setChanged();//���ñ仯��
		super.notifyObservers(price);//֪ͨ���й۲��߼۸�仯
		this.price = price;
	}
	public String toString(){
		return "���Ӽ۸�Ϊ��" + this.price ;
	}
}

class HousePriceObserver implements Observer{
	private String name;
	
	public HousePriceObserver(String name){
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(arg instanceof Double){
			System.out.print(this.name + "�۲쵽�۸����Ϊ��");
			System.out.println(((Double) arg).doubleValue());
		}
	}
	
}
