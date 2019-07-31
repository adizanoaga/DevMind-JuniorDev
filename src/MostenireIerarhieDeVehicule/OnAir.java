package MostenireIerarhieDeVehicule;

public class OnAir extends Vehicle{
	protected int noTurbines=2;
	protected boolean hasFirstClass;
	
	public OnAir(String serialNumber, int noPersons){
		super(serialNumber, noPersons);
	}
	public OnAir(String serialNumber, int noPersons, String name){
		super(serialNumber, noPersons, name);
	}
	public OnAir(String serialNumber, int noPersons, String name, int noTurbines){
		super(serialNumber, noPersons, name);
		this.noTurbines=noTurbines;
	}
	public OnAir(String serialNumber, int noPersons, String name, int noEngines, boolean hasFirstClass){
		super(serialNumber, noPersons, name);
		this.noTurbines=noTurbines;
		this.hasFirstClass=hasFirstClass;
	}
	public boolean goTo(double positionX, double positionY){
		System.out.println("Flying the airplane to coordinates: ["+positionX+", "+positionY+"]");
		return true;
	}
	public boolean addFuel(double amount){
		System.out.println("Adding "+amount+" l of fuel to the airplan");
		return true;
	}
	public void printInfo(){
		System.out.println("Vehicle properties");
		System.out.println("	- serial number: "+super.getSerialNumber());
		System.out.println("	- capacity: "+super.noPersons+" persons");
		System.out.println("	- name: "+super.name);
		System.out.println("Driving vehicle properties:");
		System.out.println("	- number of turbines: "+this.noTurbines);
		if(this.hasFirstClass==true)
			System.out.println("	- has first class");
		else
			System.out.println("	- does not have first class");
	}
}
