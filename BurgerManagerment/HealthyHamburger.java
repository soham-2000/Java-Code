package com.company.BurgerManagerment;

public class HealthyHamburger extends Hamburger {
	
	private String Extra1additionItem;
	private double Extra1additionalPrice;
	
	private String Extra2additionItem;
	private double Extra2additionalPrice;
	
	
	
	
	public HealthyHamburger(double price, String meat) {
		super("Healthy",price, meat, "Brown rye");
	}
	public void ExtraAdditional1Items (String additionItemName, double additionalPrice) {
		
		this.Extra1additionItem = additionItemName;
		this.Extra1additionalPrice = additionalPrice;
		super.count++;
	}
	public void ExtraAdditional2Items (String additionItemName, double additionalPrice) {
		
		this.Extra2additionItem = additionItemName;
		this.Extra2additionalPrice = additionalPrice;
		super.count++;
	}
	
	
	@Override
	public double TotalPrice() {
		
		double totalPrice = super.TotalPrice();
//		System.out.println(name + " Hamburger on roll " + breadroll_type + " with " + meat + " will cost = $" + price);
		
		if(Extra1additionItem!=null) {
			totalPrice += Extra1additionalPrice;
			System.out.println("Added item : " + Extra1additionItem + " for price = $" + Extra1additionalPrice);
		}
		if(Extra2additionItem!=null) {
			totalPrice += Extra2additionalPrice;
			System.out.println("Added item : " + Extra2additionItem + " for price = $" + Extra2additionalPrice);
		}
		return totalPrice;
	}
	
}
