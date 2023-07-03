package com.oops;

class Person
{
	long addharNo;
	String name;
	int age;
	long mobile;
	
	Person()
	{
		this("Vishal", 22);
		addharNo = 200592517790l;
		name = "Shiv";
		age = 24;
		mobile = 9689909228l;
		
		System.out.println(this.addharNo+" "+this.name+" "+this.age+" "+this.mobile);
	}
	
	Person(String sname, int age)
	{
		this(935906328);
		this.name = sname;
		this.age = age;
		
		System.out.println(this.name+" "+this.age);
	}
	
	Person(int mobile)
	{
		this.mobile = mobile;
		
		System.out.println(this.mobile);
	}

}


public class FourthQuestion {

	public static void main(String[] args) {
		
		Person p = new Person();

	}

}
