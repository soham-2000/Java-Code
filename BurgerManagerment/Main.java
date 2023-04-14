package com.company.BurgerManagerment;

public class Main {

	public static void main(String[] args) {
		
		Hamburger basic = new Hamburger ("basic",12,"chicken","white");
		basic.Additional1Items("onion", 5);
		basic.Additional2Items("tomato", 3);
		basic.Additional3Items("Cold Drink", 13);
		basic.setName("BasicBurger");
//		System.out.println(basic.getName());
		System.out.println("Your " + basic.getName()+" burger price = $" + basic.getPrice() + " with total " + basic.getCount() + " additional items " + " will be total of : $" + basic.TotalPrice());
		
		HealthyHamburger healthy = new HealthyHamburger(10,"lamb");
		healthy.setName("HealthyBurger");
		healthy.ExtraAdditional1Items("lattec", 2);
		healthy.ExtraAdditional2Items("cucumber", 3);
		healthy.Additional1Items("cheese", 5);
		healthy.Additional2Items("musturd sause", 2.33);
		
//		System.out.println (healthy.TotalPrice());
//		System.out.println(healthy.getCount());
		
		System.out.println("Your "+ healthy.getName() +" burger price = $" + healthy.getPrice() + " with total " + healthy.getCount() + " additional items " + " will be total of : $" + healthy.TotalPrice());
		
		DeluxeHamburger deluxe = new DeluxeHamburger();
		deluxe.setAddition1Item("Leys barbeque sausage");
		deluxe.setAddition1Price(45);
		deluxe.setAddition2Item("Sprite large");
		deluxe.setAddition2Price(90);
//		deluxe.setAddition1Item("chips");
//		deluxe.setAddition1Price(12);
		deluxe.Additional1Items("chips", 22);
		
		System.out.println("Your "+ deluxe.getName() +" burger price = $" + deluxe.getPrice() + " with total " + deluxe.getCount() + " additional items " + " will be total of : $" + deluxe.TotalPrice());
		
		
	}

}
