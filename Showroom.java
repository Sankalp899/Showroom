package JavaProject;

import java.util.Scanner;

public class Showroom implements Utility{
    String showroom_name;
    
    String showroom_address;
    
    int total_employees;
    
    int total_cars_in_stock = 0;
    
    String manager_name;
    
    @Override
    public void get_details() {
    	System.out.println("Showroom namel:"+showroom_name);
    	System.out.println("Showroom address:"+showroom_address);
    	System.out.println("Manager Name:"+manager_name);
    	System.out.println("Total emplyoees:"+total_employees);
    	System.out.println("Total cars in stock:"+total_cars_in_stock);
    }
    
    @Override
    public void set_details() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("==============Enter Showroom Details=================");
    	System.out.println();
    	System.out.println("Showroom Name:");
    	showroom_name = sc.next();
    	System.out.println("Showroom Address");
    	showroom_address = sc.next();
    	System.out.println("Manager Name:");
    	manager_name = sc.next();
    	System.out.println("Total number of emplyoees");
    	total_employees =sc.nextInt();
    	System.out.println("Total number of cars in stocks");
    	total_cars_in_stock = sc.nextInt();
    	
       	
    	
   	
    	
    	
    	
    	
    }
}
