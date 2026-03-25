package com.walking;

public class MainForMyCounters {

	public static void main(String[] args) {
		
		CounterService service = new CounterService();
		
		Counter water = new Counter("Water", "m3", 0);
		Counter electr = new Counter("Electro", "kWt", 0);
		Counter gas = new Counter("Gas", "m3", 0);
		
		service.addCounter(water);
		service.addCounter(electr);
		service.addCounter(gas);
		
		service.displayAllCounters();
		

	}

}
