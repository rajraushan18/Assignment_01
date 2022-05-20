
import java.util.*;
import java.io.*;

public class CarInsurance {
	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		InputDetails inp = new InputDetails();
		
		do {
			System.out.println("\nPlease provide the car details: ");
			String model = inp.carModel();
			String type = inp.carType();
			int cost = inp.carCost();
			String insuranceType = inp.InsuranceType();		
			
			if(type.equals("hatchback")) {
				
				Calculate cal = new Calculate();
				cal.Hatchback(model , cost , insuranceType);
				
			}else if(type.equals("sedan")) {
				
				Calculate cal = new Calculate();
				cal.Sedan(model , cost , insuranceType);
				
			}else if(type.equals("suv")){
				
				Calculate cal = new Calculate();
				cal.SUV(model , cost , insuranceType);
				
			}else
				System.err.print("something went wrong!!!");
			
			System.out.println("Do you want to enter details of any other cars(y/n)?");
			ch = sc.nextLine().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("\n--------Thank you!!!---------");
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	switch(type) {
//	case "hatchback":
//		Calculate cal = new Calculate();
//		cal.Hatchback(model , cost , insuranceType);
//		break;
//		
//	case "sedan":
//		Calculate cal = new Calculate();
//		cal.Sedan(model, cost, insuranceType);
//		break;
//		
//	case "suv":
//		Calculate cal = new Calculate();
//		cal.Sedan(model, cost, insuranceType);
//		break;
//}