package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("50,000");
		
	}

	@Override
	public void speed() {
		System.out.println("125km");
		
	}
	public static void main(String[] args) {
		Ktm a=new Ktm();
		a.speed();
		a.cost();
		a.cost();
	}

}
