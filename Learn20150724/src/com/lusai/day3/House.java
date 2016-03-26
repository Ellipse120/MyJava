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
		super.setChanged();//设置变化点
		super.notifyObservers(price);//通知所有观察者价格变化
		this.price = price;
	}
	public String toString(){
		return "房子价格为：" + this.price ;
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
			System.out.print(this.name + "观察到价格更改为：");
			System.out.println(((Double) arg).doubleValue());
		}
	}
	
}
