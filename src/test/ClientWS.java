package test;

import ws.service.*;

import java.util.Scanner;

public class ClientWS {

	public static void main(String[] args )throws Exception {
		// Création du proxy pour le service web
        ContactServiceProxy stub = new ContactServiceProxy();

        // Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Afficher le menu
        	System.out.println("\n");
            System.out.println("Menu:");
            System.out.println("1. Ajouter un contact");
            System.out.println("2. Rechercher un contact");
            System.out.println("3. Envoyer un e-mail");
            System.out.println("4. Envoyer un SMS");
            System.out.println("5. Lister les contacts");
            System.out.println("0. Quitter");

            // Demander à l'utilisateur de saisir son choix
            System.out.print("Choix : ");
            int choix = scanner.nextInt();

            // Exécuter l'opération en fonction du choix
            switch (choix) {
                case 1:
                    // Ajouter un contact
                	System.out.println("\n");
                    System.out.print("Nom : ");
                    String nom = scanner.next();
                    
                    System.out.print("Prenom : ");
                    String prenom = scanner.next();
                    
                    System.out.print("Tel : ");
                    String tel = scanner.next();
                    
                    System.out.print("Email : ");
                    String email = scanner.next();
                    
                    System.out.println(stub.ajouterContact(nom, prenom, tel, email));
                    break;
                case 2:
                    // Rechercher un contact
                	System.out.println("\n");
                    System.out.print("Critère de recherche : ");
                    
                    String critere = scanner.next();
                    
                    System.out.println(stub.rechercherContact(critere));
                    break;
                case 3:
                    // Envoyer un e-mail
                	System.out.println("\n");
                    System.out.print("Destinataire : ");
                    String destinataireEmail = scanner.next();
                    
                    scanner.nextLine();
                    
                    System.out.print("Sujet : ");
                    String sujetEmail = scanner.nextLine();
                    
                    System.out.print("Contenu : ");
                    String contenuEmail = scanner.nextLine();
                    
                    System.out.println(stub.envoyerEmail(destinataireEmail, sujetEmail, contenuEmail));
                    break;
                case 4:
                    // Envoyer un SMS
                	System.out.println("\n");
                    System.out.print("Destinataire SMS : ");
                    
                    String destinataireSms = scanner.next();
                    System.out.print("Message SMS : ");
                    
                    String message = scanner.next();
                    
                    System.out.println(stub.envoyerSms(destinataireSms, message));
                    break;
                case 5:
                    // Lister les contacts
                	System.out.println("\n");
                    System.out.println(stub.listerContacts());
                    break;
                case 0:
                    // Quitter le programme
                	System.out.println("\n");
                    System.out.println("Au revoir !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

}


