import java.util.*;
import java.io.*;

public class InputDetails {
	
	public String carModel() {
		Scanner sc = new Scanner(System.in);
		System.out.print("-model: ");
		return sc.nextLine();
	}
	
	public String carType() {
		Scanner sc = new Scanner(System.in);
		System.out.print("-type: ");
		String type;
		boolean isValid = false;
		do {
			type = sc.nextLine().toLowerCase();
			if(type.equals("hatchback") || type.equals("sedan") || type.equals("suv")) {
				isValid = true;
				//return type;
			}
			else {
				System.err.println("Entered wrong type. Please try again!!");
			}
		}while(!isValid);
		return type;
	}
	
	public int carCost() {
		Scanner sc = new Scanner(System.in);
		System.out.print("-cost: ");
		int cost;
		boolean isValid = false;
		do{
			cost = sc.nextInt();
			if(cost > 0) {
				isValid = true;
				//return cost;
			}
			else {
				System.err.println("Cost can't be negative or 0. Please try again.");
			}
		}while(!isValid);
		return cost;
	}
	
	public String InsuranceType() {
		Scanner sc = new Scanner(System.in);
		System.out.print("-insuranceType: ");
		String insuranceType;
		boolean isValid = false;
		do {
			insuranceType = sc.nextLine().toLowerCase();
			if(insuranceType.equals("basic") || insuranceType.equals("premium")) {
				isValid = true;
				//return insuranceType;
			}
			else {
				System.err.println("Entered wrong insurance type. Please try again..");
			}
		}while(!isValid);
		return insuranceType;
	}
	
}
