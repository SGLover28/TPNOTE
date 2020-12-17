import java.util.List;

public class Message implements Destinataire {

    Utilisateur auteur;
    Destinataire destinataire;
    String texte;


    public Message(){}
    public Message(Utilisateur auteur, Destinataire destinataire, String texte) {
        this.auteur = auteur;
        this.destinataire = destinataire;
        this.texte = texte;
    }


    public Utilisateur getAuteur() {
        return auteur;
    }

    public void setAuteur(Utilisateur auteur) {
        this.auteur = auteur;
    }

    public Destinataire getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Destinataire destinataire) {
        this.destinataire = destinataire;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}
