package com.company.BurgerManagerment;

public class DeluxeHamburger extends Hamburger{

	public DeluxeHamburger() {
		super("Deluxe",20,"chicken and lamb","white");
		super.Additional1Items(getAddition1Item(), getAddition1Price());
		super.Additional2Items(getAddition2Item(), getAddition2Price());
	}

	@Override
	public void Additional1Items(String additionName, double additionalPrice) {
		System.out.println("Not allowed to add any additionls in deluxe burger");
	}

	@Override
	public void Additional2Items(String additionName, double additionalPrice) {
		System.out.println("Not allowed to add any additionls in deluxe burger");
	}

	@Override
	public void Additional3Items(String additionName, double additionalPrice) {
		System.out.println("Not allowed to add any additionls in deluxe burger");
	}

	@Override
	public void Additional4Items(String additionName, double additionalPrice) {
		System.out.println("Not allowed to add any additionls in deluxe burger");
	}
	
	
}
