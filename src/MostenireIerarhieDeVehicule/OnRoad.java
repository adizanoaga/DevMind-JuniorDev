package MostenireIerarhieDeVehicule;

public class OnRoad extends Vehicle{
private int noWheels =4;
private int noDoors=4;

	public OnRoad(String serialNumber, int noPersons){
		super(serialNumber, noPersons);
	}
	public OnRoad(String serialNumber, int noPersons, String name){
		super(serialNumber, noPersons, name);
	}
	public OnRoad(String serialNumber, int noPersons, String name, int noWheels){
		super(serialNumber, noPersons, name);
		this.noWheels=noWheels;
	}
	public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors){
		super(serialNumber, noPersons, name);
		this.noWheels=noWheels;
		this.noDoors=noDoors;
	}
	public boolean goTo(double positionX, double positionY){
		System.out.println("Driving the vehicle on road to coordinates: ["+positionX+", "+positionY+"]");
		return true;
	}
	public boolean addFuel(double amount){
		System.out.println("Adding "+amount+" l of fuel to the driving vehicle");
		return true;
	}
	public void printInfo(){
		System.out.println("Vehicle properties");
		System.out.println("	- serial number: "+super.getSerialNumber());
		System.out.println("	- capacity: "+super.noPersons+" persons");
		System.out.println("	- name: "+super.name);
		System.out.println("Driving vehicle properties:");
		System.out.println("	- number of wheels: "+this.noWheels);
		System.out.println("	- number of doors: "+this.noDoors);
	}
	
}
