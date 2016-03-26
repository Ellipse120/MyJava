package com.lusai.day3; 

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	private double score;
	
	public Student(String name,int age,double score){
		
		this.name = name;
		this.age = age;
		this.score = score;
		
	}
	
	public String toString(){
		
		return name + "\t\t" + age + "\t\t" + score;
		
	}

	public int compareTo(Student stu){
		
		if(this.score > stu.score){
			return -1;
		}else if (this.score < stu.score){
			return 1;
		}else{
			if(this.age > stu.age){
				return 1;
			}else if(this.age < stu.age){
				return -1;
			}else{
				return 0;
			}
		}
	}
	
}
