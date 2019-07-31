package P2;
import java.util.Random;
import java.util.ArrayList;

public class FortuneCookie implements ISurprise{
	private static boolean primaInitializare =true;
	private static ArrayList<FortuneCookie> zicale= new ArrayList();

	private String mesaj;
	public FortuneCookie(String mesaj){
		this.mesaj=mesaj;
	}
	public void enjoy(){
		System.out.println("Mesajul din Fortune cookie este: " +mesaj);
	}
	static {
		zicale.add(new FortuneCookie("Fiecare are cate o nevoie, altul cate noua"));
		zicale.add(new FortuneCookie("Fiecare boala isi are leacul sau pe lume"));
		zicale.add(new FortuneCookie("Fiecare cauta sa aiba icoana la care sa se inchine"));
		zicale.add(new FortuneCookie("Fiecare cu norocul lui traieste"));
		zicale.add(new FortuneCookie("Fiecare stie unde il strange opinca"));
		
		zicale.add(new FortuneCookie("Fiecare face cum se pricepe"));
		zicale.add(new FortuneCookie("Fiecare graunte are faina, dar are si tarata"));
		zicale.add(new FortuneCookie("Fiecare-i dator c-o moarte"));
		zicale.add(new FortuneCookie("Fiecare matura intai inaintea portii lui"));
		zicale.add(new FortuneCookie("Fiecare nebun poate sa castige bani, dar nu poate sa-i pastreze"));
		
		zicale.add(new FortuneCookie("Fiecare oaie isi duce lana ei"));
		zicale.add(new FortuneCookie("Fiecare pe ale lui stie"));
		zicale.add(new FortuneCookie("Fiecare paine are farmaturile ei"));
		zicale.add(new FortuneCookie("Fiecare pune mana unde-l doare"));
		zicale.add(new FortuneCookie("Fiecare este stapan pe capul lui"));
		
		zicale.add(new FortuneCookie("Fiecare trage acolo unde cunoaste. "));
		zicale.add(new FortuneCookie("Fiecare trage foc la oala lui. Fiecare trebuie sa traiasca"));
		zicale.add(new FortuneCookie("Fiecare vierme gaseste borticica lui"));
		zicale.add(new FortuneCookie("Fiecare voieste a avea biserica lui"));
		zicale.add(new FortuneCookie("Fier pe fier ascute"));		
	}

	
	
	public static FortuneCookie generate(){
		new FortuneCookie("");
	    Random random = new Random();	    
	    int n = random.nextInt(zicale.size());
	    return zicale.get(n);
	}
}
