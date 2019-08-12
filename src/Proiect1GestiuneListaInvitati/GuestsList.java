package Proiect1GestiuneListaInvitati;

import java.util.ArrayList;

public class GuestsList {

	private static int locuriDisponibile;
	private ArrayList<Guest> participanti = new ArrayList<Guest>();
	private ArrayList<Guest> persoaneInAsteptare = new ArrayList<Guest>();

	public GuestsList(int locuriDisponibile) {
		this.locuriDisponibile=locuriDisponibile;
	}

	public boolean check(Guest persoana) {
		for (int i = 0; i < participanti.size(); i++) {
			if (participanti.get(i).getLastName()
					.equals(persoana.getLastName())) {
				if (participanti.get(i).getFirstName()
						.equals(persoana.getFirstName())) {
					return true;
				}
			}
			if (participanti.get(i).getEmail().equals(persoana.getEmail())) {
				return true;
			}
			if (participanti.get(i).getPhoneNumber()
					.equals(persoana.getPhoneNumber())) {
				return true;
			}
		}
		for (int i = 0; i < persoaneInAsteptare.size(); i++) {
			if (persoaneInAsteptare.get(i).getLastName()
					.equals(persoana.getLastName())) {
				if (persoaneInAsteptare.get(i).getFirstName()
						.equals(persoana.getFirstName())) {
					return true;
				}
			}
			if (persoaneInAsteptare.get(i).getEmail()
					.equals(persoana.getEmail())) {
				return true;
			}
			if (persoaneInAsteptare.get(i).getPhoneNumber()
					.equals(persoana.getPhoneNumber())) {
				return true;
			}
		}
		return false;
	}

	public int add(Guest persoana) {
		if (this.participanti.size() < this.locuriDisponibile){
			if(!this.check(persoana)){
				this.participanti.add(persoana);
				System.out.println("["+persoana.getLastName()+" "+persoana.getFirstName()+"] "+"Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
				return 0;
			} else 
				return -1;
		} else if (this.participanti.size() >= this.locuriDisponibile){
			if(!this.check(persoana)){
				this.persoaneInAsteptare.add(persoana);
				System.out.println("["+persoana.getLastName()+" "+persoana.getFirstName()+"] "+"Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine <"+persoaneInAsteptare.size()+">. Te vom notifica daca un loc devine disponibil.");
				return this.persoaneInAsteptare.size();
			} else
				return -1;
		} 
		return -1;
	}
	
	public int checkNameAndFirstName(String a, String b, ArrayList<Guest> arr){
		for(int i=0; i<arr.size();i++){
			if(arr.get(i).getFirstName().equals(a))
				if(arr.get(i).getLastName().equals(b))
					return i;
			if(arr.get(i).getFirstName().equals(b))
				if(arr.get(i).getLastName().equals(a))
					return i;
		}
		return -1;
	}
	
	public int checkEmail(String a, ArrayList<Guest> arr){
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).getEmail().equals(a));
				return i;
		}
		return -1;
	}
	
	
	public int checkPhoneNumber(String a, ArrayList<Guest> arr){
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).getPhoneNumber().equals(a))
				return i;
		}
		return -1;
	}
	
	public boolean remove(String a){
		if(checkEmail(a, participanti)>=0){
			participanti.remove(checkEmail(a, participanti));
			if(this.persoaneInAsteptare.size()!=0){
				participanti.add(persoaneInAsteptare.get(0));
				persoaneInAsteptare.remove(0);
			}
			return true;
		} else if (checkEmail(a,persoaneInAsteptare)>=0){
			persoaneInAsteptare.remove(checkEmail(a,persoaneInAsteptare));
			return true;
		} else if(checkPhoneNumber(a, participanti)>=0){
			participanti.remove(checkPhoneNumber(a, participanti));
			if(this.persoaneInAsteptare.size()!=0){
			participanti.add(persoaneInAsteptare.get(0));
			persoaneInAsteptare.remove(0);
			}
		} else if(checkPhoneNumber(a,persoaneInAsteptare)>=0){
			persoaneInAsteptare.remove(checkEmail(a,persoaneInAsteptare));
			return true;
		}
		return false;
	}
	
	public boolean remove(String a, String b){
		if(checkNameAndFirstName(a,b, participanti)>=0){
			participanti.remove(checkNameAndFirstName(a,b, participanti));
			if(this.persoaneInAsteptare.size()!=0){
				participanti.add(persoaneInAsteptare.get(0));
				persoaneInAsteptare.remove(0);
			}
			return true;
		} else if (checkNameAndFirstName(a,b,persoaneInAsteptare)>=0){
			persoaneInAsteptare.remove(checkNameAndFirstName(a,b,persoaneInAsteptare));
			return true;
		}
		return false;
	}
	public void update(String a, String b, int n){
		if(n==3){
			if(checkEmail(a, participanti)>=0){
				participanti.get(checkEmail(a, participanti)).setEmail(b);
			} else if(checkEmail(a, persoaneInAsteptare)>=0){
				persoaneInAsteptare.get(checkEmail(a, persoaneInAsteptare)).setEmail(b);
			} else
				System.out.println("Nu s a gasit persoana !");
		} else if(n==4){
			if(checkPhoneNumber(a, participanti)>=0){
				participanti.get(checkPhoneNumber(a, participanti)).setPhoneNumber(b);
			} else if(checkPhoneNumber(a, persoaneInAsteptare)>=0){
				persoaneInAsteptare.get(checkPhoneNumber(a, persoaneInAsteptare)).setPhoneNumber(b);
			} else
				System.out.println("Nu s a gasit persoana !");
		}
	}
	
	public void update (String a, String a2, String b, int n){
		if(n==1){
			if(checkNameAndFirstName(a, a2, participanti)>=0){
				participanti.get(checkNameAndFirstName(a, a2, participanti)).setLastName(b);
			} else if(checkNameAndFirstName(a, a2, persoaneInAsteptare)>=0){
				persoaneInAsteptare.get(checkNameAndFirstName(a, a2, persoaneInAsteptare)).setLastName(b);
			} 				
		} else if(n==2){
			if(checkNameAndFirstName(a, a2, participanti)>=0){
				participanti.get(checkNameAndFirstName(a, a2, participanti)).setFirstName(b);
			} else if(checkNameAndFirstName(a, a2, persoaneInAsteptare)>=0){
				persoaneInAsteptare.get(checkNameAndFirstName(a, a2, persoaneInAsteptare)).setFirstName(b);
			} 	
		}
	}

	public static int getLocuriDisponibile() {
		return locuriDisponibile;
	}

	public static void setLocuriDisponibile(int locuriDisponibile) {
		GuestsList.locuriDisponibile = locuriDisponibile;
	}

	public ArrayList<Guest> getParticipanti() {
		return participanti;
	}

	public void setParticipanti(ArrayList<Guest> participanti) {
		this.participanti = participanti;
	}

	public ArrayList<Guest> getPersoaneInAsteptare() {
		return persoaneInAsteptare;
	}

	public void setPersoaneInAsteptare(ArrayList<Guest> persoaneInAsteptare) {
		this.persoaneInAsteptare = persoaneInAsteptare;
	}

	public void updateFirstName(String a, int index, Guest p){
		p.setFirstName(a);
	}
	public void updateLastName(String a, int index, Guest p){
		p.setLastName(a);
	}
	public void updateEmail(String a, int index, Guest p){
		p.setEmail(a);
	}
	public void updatePhoneNumber(String a, int index, Guest p){
		p.setPhoneNumber(a);
	}
	public int searchLastName(String a, ArrayList<Guest> arr){
		int sum=0;
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i).getLastName().equals(a))
				sum++;
		}
		return sum;
	}
	public int searchFirstName(String a, ArrayList<Guest> arr){
		int sum=0;
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i).getFirstName().equals(a))
				sum++;
		}
		return sum;
	}
	public int searchEmail(String a, ArrayList<Guest> arr){
		int sum=0;
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i).getEmail().equals(a))
				sum++;
		}
		return sum;
	}
	public int searchPhoneNumber(String a, ArrayList<Guest> arr){
		int sum=0;
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i).getPhoneNumber().equals(a))
				sum++;
		}
		return sum;
	}
}
