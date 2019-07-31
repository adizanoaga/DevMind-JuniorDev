package MostenireIerarhieDeVehicule;

public class OnWater extends Vehicle{
	protected int noEngines=2;
	protected int cargoCapacity;
	
	public OnWater(String serialNumber, int noPersons){
		super(serialNumber, noPersons);
	}
	public OnWater(String serialNumber, int noPersons, String name){
		super(serialNumber, noPersons, name);
	}
	public OnWater(String serialNumber, int noPersons, String name, int noEngines){
		super(serialNumber, noPersons, name);
		this.noEngines=noEngines;
	}
	public OnWater(String serialNumber, int noPersons, String name, int noEngines, int cargoCapacity){
		super(serialNumber, noPersons, name);
		this.noEngines=noEngines;
		this.cargoCapacity=cargoCapacity;
	}
	public boolean goTo(double positionX, double positionY){
		System.out.println("Sailing the vessel to coordinates: ["+positionX+", "+positionY+"]");
		return true;
	}
	public boolean addFuel(double amount){
		System.out.println("Adding "+amount+" l of fuel to the vessel");
		return true;
	}
	public void printInfo(){
		System.out.println("Vehicle properties");
		System.out.println("	- serial number: "+super.getSerialNumber());
		System.out.println("	- capacity: "+super.noPersons+" persons");
		System.out.println("	- name: "+super.name);
		System.out.println("Driving vehicle properties:");
		System.out.println("	- number of engines: "+this.noEngines);
		System.out.println("	- cargo capacity: "+this.noPersons);
	}
	
	
}
