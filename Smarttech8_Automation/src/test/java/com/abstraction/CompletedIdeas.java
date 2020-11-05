  package com.abstraction;

  public  class CompletedIdeas implements CompanyIdea, CompanyIdea2{

    public void engine() {
		
		System.out.println("Engine : Import from japan");
	}

	public void model() {
	
		System.out.println("Model : XLE limited");
	}

	public void carbody() {
		
		System.out.println("Carbody type : SUV");
	}

	public void getEmployee() {
		
		System.out.println("EMployee as manager : Rabeya");
	}

	public void getSalary() {
		
		System.out.println("Manager salary : $150000");
	}

	public void getCar() {
		
		System.out.println("Car Name : BMW 700 ");
	}

	public void getMedicare() {
		
		System.out.println("Medicare : Full coverage");
	
	}
	
	public static void main(String[] args) {
		
		CompletedIdeas obj = new CompletedIdeas();
	
	      obj.engine();
	      obj.carbody();
	      obj.getCar();
	      obj.getEmployee();
	
	
	}
}
  