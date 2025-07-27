package javaoops.task2;

public class Employee {
	static int count = 3;

    public Employee() {
        count++;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee emp1 = new Employee();
		 Employee emp2 = new Employee();
		 Employee emp3 = new Employee();

		  System.out.println("Total number of employees: " + Employee.count);
	}
		

	}

