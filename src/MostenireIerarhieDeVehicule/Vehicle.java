package MostenireIerarhieDeVehicule;

public class Vehicle {
	private final String serialNumber;
	protected int noPersons;
	protected String name;

	public Vehicle(String serialNumber, int noPersons){
		this.serialNumber=serialNumber;
		this.noPersons=noPersons;
	}
	public Vehicle(String serialNumber, int noPersons, String name){
		this(serialNumber,noPersons);
		this.name=name;		
	}
	public final String getSerialNumber(){
		return serialNumber;
	}
	public boolean goTo(double positionX, double positionY){
		System.out.println("Error: unknown vehicle cannot move�");
		return false;
	}
	public boolean addFuel(double amount){
		System.out.println("Error: unknown vehicle cannot move�");
		return false;
	}
	public void printInfo(){
		System.out.println("Vehicle properties");
		System.out.println("	- serial number: "+this.serialNumber);
		System.out.println("	- capacity: "+this.noPersons+" persons");
		System.out.println("	- name: "+this.name);
	}
}
