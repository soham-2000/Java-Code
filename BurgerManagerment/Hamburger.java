package com.company.BurgerManagerment;

public class Hamburger {
	
	private String name;
	private double price;
	private String meat;
	private String breadroll_type;
	
	protected int count;
	private String addition1Item;
	private double addition1Price;
	private String addition2Item;
	private double addition2Price;
	private String addition3Item;
	private double addition3Price;
	private String addition4Item;
	private double addition4Price;
	
	public Hamburger(String name, double price, String meat, String breadroll_type) {
		this.name = name;
		this.price = price;
		this.meat = meat;
		this.breadroll_type = breadroll_type;
		this.count = 0;
	}

	public void Additional1Items (String additionName, double additionalPrice) {
		
		this.addition1Item = additionName;
		this.addition1Price = additionalPrice;
		count++;
		
	}
	public void Additional2Items (String additionName, double additionalPrice) {
		
		this.addition2Item = additionName;
		this.addition2Price = additionalPrice;
		count++;
	}
	public void Additional3Items (String additionName, double additionalPrice) {
		
		this.addition3Item = additionName;
		this.addition3Price = additionalPrice;
		count++;
	}
	public void Additional4Items (String additionName, double additionalPrice) {
		
		this.addition4Item = additionName;
		this.addition4Price = additionalPrice;
		count++;
	}
	
	public double TotalPrice() {
		
		double totalPrice = price;
		System.out.println("\n" +name + " Hamburger on roll " + breadroll_type + " with " + meat + " will cost = $" + price);
		if(addition1Item!=null) {
			totalPrice += addition1Price;
			System.out.println("Added item : " + addition1Item + " for price = $" + addition1Price);
		}
		if(addition2Item!=null) {
			totalPrice += addition2Price;
			System.out.println("Added item : " + addition2Item + " for price = $" + addition2Price);
		}
		if(addition3Item!=null) {
			totalPrice += addition3Price;
			System.out.println("Added item : " + addition3Item + " for price = $" + addition3Price);
		}
		if(addition4Item!=null) {
			totalPrice += addition4Price;
			System.out.println("Added item : " + addition4Item + " for price = $" + addition4Price);
		}
		return totalPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getBreadroll_type() {
		return breadroll_type;
	}

	public void setBreadroll_type(String breadroll_type) {
		this.breadroll_type = breadroll_type;
	}

	public int getCount() {
		return count;
	}

	public String getAddition1Item() {
		return addition1Item;
	}

	public void setAddition1Item(String addition1Item) {
		this.addition1Item = addition1Item;
	}

	public double getAddition1Price() {
		return addition1Price;
	}

	public void setAddition1Price(double addition1Price) {
		this.addition1Price = addition1Price;
	}

	public String getAddition2Item() {
		return addition2Item;
	}

	public void setAddition2Item(String addition2Item) {
		this.addition2Item = addition2Item;
	}

	public double getAddition2Price() {
		return addition2Price;
	}

	public void setAddition2Price(double addition2Price) {
		this.addition2Price = addition2Price;
	}
	
	
	
	
	
	
	
}
