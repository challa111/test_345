package employeeQuestion;

import java.util.Date;

public class Employee {

	
	    private final String name;

	    private final int id;

	    private final Date dateHired;

	    private final boolean isManager;

	    private final boolean isPartTime;

	    
	   

	    public Employee( String employeeName,  int employeeId,  Date employeeHiredDate,
	     boolean isEmployeeManager,  boolean isEmployeePartTime)
	    {
	        this.name=employeeName;
	        this.id=employeeId;
	        this.dateHired=employeeHiredDate;
	        this.isManager=isEmployeeManager;
	        this.isPartTime=isEmployeePartTime;
	    }

	    public Employee setEmployeePartTimeStatus(boolean status){
	        return new Employee(name, id, dateHired, isManager, status);
	    }

	    public Employee setManagerStatus(boolean status){
	        return new Employee(name, id, dateHired, status, isPartTime);
	    }

	    public boolean isManager() {
			return isManager;
		}

		public String getName(){
	        return this.name;
	    }

	    public int getId(){
	        return this.id;
	    }

	    public Date getDateHired(){
	        return this.dateHired;
	    }

	   

		public boolean isPartTime() {
			return isPartTime;
		}

	  
	}
