package JavaProject;

import java.util.Scanner;
import java.util.UUID;

public class Employees	extends Showroom implements Utility {
  String emp_id;
  String emp_name;
  int emp_age;
  String emp_departments;




@Override
public void get_details() {
	System.out.println("ID:"+emp_id);
	System.out.println("Name:"+emp_name);
	System.out.println("Age:"+emp_age);
	System.out.println("Departments:"+emp_departments);
	System.out.println("Showroom name:"+showroom_name);
}

@Override
public void set_details() {
	Scanner sc = new Scanner(System.in);
	UUID uuid = UUID.randomUUID();
	emp_id =String.valueOf(uuid);
	System.out.println("=========================Enter Employees details=========================");
	System.out.println();
	System.out.println("Employee Name:");
	emp_name = sc.next();
	System.out.println("Employees Age:");
	emp_age = sc.nextInt();
	System.out.println("Employees Departement:");
	emp_departments = sc.next();
	System.out.println("Showroom name:");
	showroom_name = sc.next();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
