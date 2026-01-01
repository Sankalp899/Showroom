package JavaProject;

import java.util.Scanner;

public class Cars extends Showroom implements Utility {
    String car_name;
    
    String car_color;
    
    String car_fuel_type;
    
    int car_price;
    
    String car_type;
    
    String car_transmission;
    
    
    @Override
    public void get_details() {
    	System.out.println("Name:"+car_name);
    	System.out.println("Color:"+car_color);
    	System.out.println("car_fuel_type:"+car_fuel_type);
    	System.out.println("car_price:"+car_price);
    	System.out.println("car_type:"+car_type);
    	System.out.println("car_trasmission:"+car_transmission);
    	
    }    	
    @Override
    public void set_details() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("===================== Enter Car Details========================");
    	System.out.println();
    	System.out.println("Car Name: ");
    	car_name = sc.next();
    	System.out.println("Car color: ");
    	car_color = sc.next();
    	System.out.println("Car fuel type(Petrol/Disesl) ");
    	car_fuel_type = sc.next();
    	System.out.println("Car price:");
    	car_price = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Car Type(Sedan/SUV/HacthBacks): ");
    	car_type = sc.next();
    	System.out.println("Car transisition(Automatic/Manual)");
    	car_transmission = sc.next();
    	total_cars_in_stock++;
    }
    	
    }




















