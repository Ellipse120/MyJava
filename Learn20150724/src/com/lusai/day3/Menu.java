package com.lusai.day3;

public class Menu {
	public Menu(){
		while(true){
			this.show();
		}
	}
	
	public void show(){
		System.out.println("==== MENU SYSTEM ====");
		System.out.println(" [1].增加数据");
		System.out.println(" [2].删除数据");
		System.out.println(" [3].修改数据");
		System.out.println(" [4].查看数据");
		System.out.println(" [5].系统退出\n");
		InputData input = new InputData();
		int i = input.getInt("Please choose: ", "Wrong!Please check!");
		switch(i) {
		case 1:{
			Operate.add();
			break;
		}
		case 2:{
			Operate.delete();
			break;
		}
		case 3:{
			Operate.update();
			break;
		}
		case 4:{
			Operate.find();
			break;
		}
		case 5:{
			System.exit(1);
			break;
		}
		default: {
			System.out.println("Please choose the right operation!");
		}
		}
	}
}
