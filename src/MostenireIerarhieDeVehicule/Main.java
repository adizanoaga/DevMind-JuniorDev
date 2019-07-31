package MostenireIerarhieDeVehicule;

public class Main {

	public static void main(String[] args) {
		OnRoad onRoad=new OnRoad("ABCD",5,"GOLF",4,2);
		OnWater onWater=new OnWater("ABCD-Water", 200, "Filip", 2, 2000);
		OnAir onAir=new OnAir("ABCD-Air", 2, "F16", 1, true);
		onAir.addFuel(200);
		onAir.goTo(1001, 2002);
		onAir.printInfo();
		System.out.println("--------------------------------");
		onWater.addFuel(350);
		onWater.goTo(321, 555);
		onWater.printInfo();
		System.out.println("--------------------------------");
		onRoad.addFuel(50);
		onRoad.goTo(102, 211);
		onRoad.printInfo();
		System.out.println("--------------------------------");
	}

}
