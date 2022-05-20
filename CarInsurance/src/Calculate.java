import java.util.*;
import java.io.*;

public class Calculate {
	
	public void display(String model, int cost, int finalPremiumCost) {
		System.out.println("\n-----------------------------");
		System.out.println("Model: " + model);
		System.out.println("Cost: " + cost);
		System.out.println("Total Insurance: " + finalPremiumCost);
		System.out.println("-----------------------------\n");
	}

	public void Hatchback(String model , int cost , String insuranceType) {
		int initialPremiumCost = (cost*5)/100;
		int finalPremiumCost = initialPremiumCost;
		if(insuranceType.equals("premium")) {
			finalPremiumCost += (finalPremiumCost*20)/100;
		}
		
		display(model, cost, finalPremiumCost);
		
	}
	
	public void Sedan(String model , int cost , String insuranceType) {
		int initialPremiumCost = (cost*8)/100;
		int finalPremiumCost = initialPremiumCost;
		if(insuranceType.equals("premium")) {
			finalPremiumCost += (finalPremiumCost*20)/100;
		}
		
		display(model, cost, finalPremiumCost);
		
	}
	
	public void SUV(String model , int cost , String insuranceType) {
		int initialPremiumCost = (cost*10)/100;
		int finalPremiumCost = initialPremiumCost;
		if(insuranceType.equals("premium")) {
			finalPremiumCost += (finalPremiumCost*20)/100;
		}
		
		display(model, cost, finalPremiumCost);
		
	}
	
}
