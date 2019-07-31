package P1;

import java.util.Scanner;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Bun venit! Introduceti numarul de locuri disponibile:");
		int n = sc.nextInt();
		GuestsList guestsList = new GuestsList(n);
		boolean run = true;
		while (run) {
			System.out
					.println("\nAsteapta comanda: (help - Afiseaza lista de comenzi)");
			String a = sc.next();
			switch (a) {
			case "help":
				help();
				break;
			case "add":
				add(guestsList);
				break;
			case "check":
				check(guestsList, sc);
				break;
			case "remove":
				remove(guestsList, sc);
				break;
			case "update":
				update(guestsList, sc);
				break;
			case "guests":
				guests(guestsList);
				break;
			case "waitlist":
				waitlist(guestsList);
				break;
			case "available":
				available(guestsList, n);
				break;
			case "guests_no":
				guest_no(guestsList);
				break;
			case "waitlist_no":
				waitlist_no(guestsList);
				break;
			case "subscribe_no":
				subscribe_no(guestsList);
				break;
			case "search":
				search(guestsList, sc);
				break;
			case "quit":
				System.out.println("Aplicatia s-a inchis");
				run = false;
				break;
			default:
				System.out.println("COMANDA GRESITA !");
				break;
			}
		}

	}

	public static void help() {
		System.out
				.println("help - Afiseaza aceasta lista de comenzi \n"
						+ "add - Adauga o noua persoana (inscriere) \n"
						+ "check - Verifica daca o persoana este inscrisa la eveniment \n"
						+ "remove - Sterge o persoana existenta din lista \n"
						+ "update - Actualizeaza detaliile unei persoane \n"
						+ "guests - Lista de persoane care participa la eveniment \n"
						+ "waitlist - Persoanele din lista de asteptare \n"
						+ "available - Numarul de locuri libere \n"
						+ "guests_no - Numarul de persoane care participa la eveniment \n"
						+ "waitlist_no - Numarul de persoane din lista de asteptare \n"
						+ "subscribe_no - Numarul total de persoane inscrise \n"
						+ "search - Cauta toti invitatii conform sirului de caractere introdus \n"
						+ "quit - Inchide aplicatia");
	}

	public static void add(GuestsList guestsList) {
		System.out.println("Se adauga o noua persoana");
		System.out.println("Introduceti numele de familie:");
		Scanner sc = new Scanner(System.in);
		Guest persoana = new Guest();
		persoana.setLastName(sc.next());
		System.out.println("Introduceti prenumele:");
		persoana.setFirstName(sc.next());
		System.out.println("Introduceti email:");
		persoana.setEmail(sc.next());
		System.out.println("Introduceti numarul de telefon:");
		persoana.setPhoneNumber(sc.next());
		guestsList.add(persoana);

	}

	public static void guests(GuestsList guestsList) {
		if (guestsList.getParticipanti().size() == 0) {
			System.out.println("Lista de participanti este goala");
		}
		for (int i = 0; i < guestsList.getParticipanti().size(); i++) {
			System.out.print("\n" + (i + 1) + "." + " Nume: "
					+ guestsList.getParticipanti().get(i).getLastName());
			System.out
					.print(" "
							+ guestsList.getParticipanti().get(i)
									.getFirstName() + ", ");
			System.out.print("Email: "
					+ guestsList.getParticipanti().get(i).getEmail() + ", ");
			System.out.print("Telefon: "
					+ guestsList.getParticipanti().get(i).getPhoneNumber());
		}
	}

	public static void waitlist(GuestsList guestsList) {
		if (guestsList.getPersoaneInAsteptare().size() == 0) {
			System.out.println("Lista de asteptare este goala");
		}
		for (int i = 0; i < guestsList.getPersoaneInAsteptare().size(); i++) {
			System.out.print((i + 1) + "." + " Nume: "
					+ guestsList.getPersoaneInAsteptare().get(i).getLastName());
			System.out.print(" "
					+ guestsList.getPersoaneInAsteptare().get(i).getFirstName()
					+ ", ");
			System.out.print("Email: "
					+ guestsList.getPersoaneInAsteptare().get(i).getEmail()
					+ ", ");
			System.out.print("Telefon: "
					+ guestsList.getPersoaneInAsteptare().get(i)
							.getPhoneNumber());
		}
	}

	public static void guest_no(GuestsList guestsList) {
		System.out.println("Numarul de participanti: "
				+ guestsList.getParticipanti().size());
	}

	public static void waitlist_no(GuestsList guestsList) {
		System.out.println("Dimensiunea listei de asteptare: "
				+ guestsList.getPersoaneInAsteptare().size());
	}

	public static void subscribe_no(GuestsList guestsList) {
		int n = guestsList.getParticipanti().size()
				+ guestsList.getPersoaneInAsteptare().size();
		System.out.println("Numarul total de persoane: " + n);
	}

	public static void available(GuestsList guestsList, int nr) {
		int n = nr - guestsList.getParticipanti().size();
		System.out.println("Numarul total de persoane: " + n);
	}

	public static void update(GuestsList guestsList, Scanner sc) {
		System.out.println("Se actualizeaza detaliile unei persoane…");
		System.out
				.println("Alege modul de autentificare, tastand:\n\"1\" - Nume si prenume \n\"2\" - Email \n\"3\" - Numar de telefon (format +40733386463)");
		int n = sc.nextInt();
		String a = "";
		int nr = -2;
		int n2 = 0;
		boolean inListaParticipanti = true;
		switch (n) {
		case 1:
			System.out.println("Introduceti numele de familie:");
			String nume=sc.next();
			System.out.println("Introduceti prenumele:");
			String prenume=sc.next();
			nr=guestsList.checkNameAndFirstName(nume, prenume, guestsList.getParticipanti());
			if (nr < 0) {
				nr = guestsList.checkPhoneNumber(a,
						guestsList.getPersoaneInAsteptare());
				inListaParticipanti = false;
			}
			System.out.println("Alege campul de actualizat, tastand:\n\"1\" - Nume\n\"2\" - Prenume\n\"3\" - Email\n\"4\" - Numar de telefon (format +40733386463)");
			n2 = sc.nextInt();
			actualizare(guestsList, sc, n2, nr, inListaParticipanti);
			break;
		case 2:
			System.out.println("Introduceti email:");
			a = sc.next();
			nr=guestsList.checkEmail(a,guestsList.getParticipanti());
			inListaParticipanti =true;
			if (nr < 0) {
				nr = guestsList.checkEmail(a,
						guestsList.getPersoaneInAsteptare());
				inListaParticipanti = false;
			}
			System.out.println("Alege campul de actualizat, tastand:\n\"1\" - Nume\n\"2\" - Prenume\n\"3\" - Email\n\"4\" - Numar de telefon (format +40733386463)");
			n2 = sc.nextInt();
			actualizare(guestsList, sc, n2, nr, inListaParticipanti);
			break;
		case 3:
			System.out
					.println("Introduceti numar de telefon (format +40733386463):");
			a = sc.next();
			nr = guestsList.checkPhoneNumber(a, guestsList.getParticipanti());
			inListaParticipanti = true;
			if (nr < 0) {
				nr = guestsList.checkPhoneNumber(a,
						guestsList.getPersoaneInAsteptare());
				inListaParticipanti = false;
			}
			System.out
					.println("Alege campul de actualizat, tastand:\n\"1\" - Nume\n\"2\" - Prenume\n\"3\" - Email\n\"4\" - Numar de telefon (format +40733386463)");
			n2 = sc.nextInt();
			actualizare(guestsList, sc, n2, nr, inListaParticipanti);
			break;
		default:
			System.out.println("Comanda Gresita !");
		}
	}

	public static void actualizare(GuestsList guestsList, Scanner sc, int n2, int nr, boolean inListaParticipanti) {
		switch (n2) {
		case 1:
			System.out.println("Introduceti numele de familie:");
			String a = sc.next();
			if (inListaParticipanti)
				guestsList.updateLastName(a, nr, guestsList
						.getParticipanti().get(nr));
			else
				guestsList.updateLastName(a, nr, guestsList
						.getPersoaneInAsteptare().get(nr));
			break;
		case 2:
			System.out.println("Introduceti prenumele:");
			a = sc.next();
			if (inListaParticipanti)
				guestsList.updateFirstName(a, nr, guestsList
						.getParticipanti().get(nr));
			else
				guestsList.updateFirstName(a, nr, guestsList
						.getPersoaneInAsteptare().get(nr));
			break;
		case 3:
			System.out.println("Introduceti email:");
			a = sc.next();
			if (inListaParticipanti)
				guestsList.updateEmail(a, nr, guestsList.getParticipanti()
						.get(nr));
			else
				guestsList.updateEmail(a, nr, guestsList
						.getPersoaneInAsteptare().get(nr));
			break;
		case 4:
			System.out.println("Introduceti numarul de telefon:");
			a = sc.next();
			if (inListaParticipanti)
				guestsList.updatePhoneNumber(a, nr, guestsList
						.getParticipanti().get(nr));
			else
				guestsList.updatePhoneNumber(a, nr, guestsList
						.getPersoaneInAsteptare().get(nr));
			break;
		default:
			System.out.println("Comanda gresita !");
		}

	}

	public static void remove(GuestsList guestsList, Scanner sc){
		System.out.println("Se sterge o persoana existenta din lista…");
		System.out.println("Alege modul de autentificare, tastand:\n\"1\" - Nume si prenume \n\"2\" - Email \n\"3\" - Numar de telefon (format +40733386463)");
		int n = sc.nextInt();
		switch(n){
		case 1:
			System.out.println("Introduceti numele:");
			String a=sc.next();
			System.out.println("Introduceti prenumele:");
			String b=sc.next();
			guestsList.remove(a, b);
			break;
		case 2:
			System.out.println("Introduceti email:");
			a=sc.next();
			guestsList.remove(a);
			break;
		case 3:
			System.out.println("Introduceti numarul de telefon:");
			a=sc.next();
			guestsList.remove(a);
			break;
		}
	}

	public static void check(GuestsList guestsList, Scanner sc){
		System.out.println("Se cauta daca o persoana existenta din lista…");
		System.out.println("Alege modul de cautare, tastand:\n\"1\" - Nume si prenume \n\"2\" - Email \n\"3\" - Numar de telefon (format +40733386463)");
		int n = sc.nextInt();
		boolean inListaParticipanti=true;
		switch(n){
		case 1:
			System.out.println("Introduceti numele de familie:");
			String nume=sc.next();
			System.out.println("Introduceti prenumele:");
			String prenume=sc.next();
			int nr=guestsList.checkNameAndFirstName(nume, prenume, guestsList.getParticipanti());
			if (nr < 0) {
				nr = guestsList.checkNameAndFirstName(nume,prenume,
						guestsList.getPersoaneInAsteptare());
				inListaParticipanti = false;
			}
			if(nr>=0)
				System.out.println("Persoana se afla pe lista");
			else
				System.out.println("Persoana NU se afla pe lista");
			break;
		case 2:
			System.out.println("Introduceti email:");
			String a=sc.next();
			nr=guestsList.checkEmail(a, guestsList.getParticipanti());
			if (nr < 0) {
				nr = guestsList.checkEmail(a,
						guestsList.getPersoaneInAsteptare());
				inListaParticipanti = false;
			}
			if(nr>=0)
				System.out.println("Persoana se afla pe lista");
			else
				System.out.println("Persoana NU se afla pe lista");
			break;
		case 3:
			System.out.println("Introduceti numarul de telefon:");
			a=sc.next();
			nr=guestsList.checkPhoneNumber(a, guestsList.getParticipanti());
			if (nr < 0) {
				nr = guestsList.checkPhoneNumber(a,
						guestsList.getPersoaneInAsteptare());
				inListaParticipanti = false;
			}
			if(nr>=0)
				System.out.println("Persoana se afla pe lista");
			else
				System.out.println("Persoana NU se afla pe lista");
			break;
		}
	}

	public static void search(GuestsList guestsList, Scanner sc){
		System.out.println("Se cauta cate persoane care au elementul comun exista in lista…");
		System.out.println("Alege modul de cautare, tastand:\n\"1\" - Nume \n\"2\" - Prenume \n\"3\" - Email \n\"4\" - Numar de telefon (format +40733386463)");
		int n = sc.nextInt();
		int sum=0;
		switch(n){
		case 1:
			System.out.println("Introduceti numele de familie:");
			String nume=sc.next();
			sum=guestsList.searchLastName(nume, guestsList.getParticipanti())+guestsList.searchLastName(nume, guestsList.getPersoaneInAsteptare());
			System.out.println("Numarul de persoane care au numele "+nume+" este "+sum);
			break;
		case 2:
			System.out.println("Introduceti prenumele:");
			String prenume=sc.next();
			sum=guestsList.searchFirstName(prenume, guestsList.getParticipanti())+guestsList.searchFirstName(prenume, guestsList.getPersoaneInAsteptare());
			System.out.println("Numarul de persoane care au prenumele "+prenume+" este "+sum);
			break;
		case 3:
			System.out.println("Introduceti email:");
			String email=sc.next();
			sum=guestsList.searchEmail(email, guestsList.getParticipanti())+guestsList.searchEmail(email, guestsList.getPersoaneInAsteptare());
			System.out.println("Numarul de persoane care au email-ul "+email+" este "+sum);
			break;
		case 4:
			System.out.println("Introduceti numarul de telefon:");
			String telefon=sc.next();
			sum=guestsList.searchPhoneNumber(telefon, guestsList.getParticipanti())+guestsList.searchPhoneNumber(telefon, guestsList.getPersoaneInAsteptare());
			System.out.println("Numarul de persoane care au email-ul "+telefon+" este "+sum);
			break;
		default:
			System.out.println("VALOARE GRESITA !");
			break;
		}
	}
}
