import java.util.List;

public class Utilisateur {


    List<ServeurDiscussion> serveurs;
    String nom;
    String prenom;
    String login;
    String motDePasse;
    String mail;


    public Utilisateur(){};
    public Utilisateur(List<ServeurDiscussion> serveurs, String nom, String prenom, String login, String motDePasse, String mail) {
        this.serveurs = serveurs;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.motDePasse = motDePasse;
        this.mail = mail;
    }
}
