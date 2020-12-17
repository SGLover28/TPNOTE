
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Canal implements Destinataire, Comparable {


    Map<Rôle, List<Utilisateur>> mapping_rôle_utilisateurs;
    Integer ordre;
    List<Webhook> webhooks;
    String nom;
    Map<Rôle, List<Habilitation>> mapping_rôle_habilitations;
    List<Message> historiques;

    Canal(){}

    public Map<Rôle, List<Utilisateur>> getMapping_rôle_utilisateurs() {
        return mapping_rôle_utilisateurs;
    }

    public void setMapping_rôle_utilisateurs(Map<Rôle, List<Utilisateur>> mapping_rôle_utilisateurs) {
        this.mapping_rôle_utilisateurs = mapping_rôle_utilisateurs;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public List<Webhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(List<Webhook> webhooks) {
        this.webhooks = webhooks;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<Rôle, List<Habilitation>> getMapping_rôle_habilitations() {
        return mapping_rôle_habilitations;
    }

    public void setMapping_rôle_habilitations(Map<Rôle, List<Habilitation>> mapping_rôle_habilitations) {
        this.mapping_rôle_habilitations = mapping_rôle_habilitations;
    }

    public List<Message> getHistoriques() {
        return historiques;
    }

    public void setHistoriques(List<Message> historiques) {
        this.historiques = historiques;
    }

    public void ecrireMessage(Utilisateur u, Message m) throws ActionNonAutoriseeException{

        List<Rôle> roleCapableDEcricre = new ArrayList<>();

            for(Rôle i : mapping_rôle_habilitations.keySet()){
                if(mapping_rôle_habilitations.get(i).contains(Habilitation.ECRITURE)){
                    roleCapableDEcricre.add(i);
                }
            }

    Boolean uPeutecrire =false;
            for(Rôle j : roleCapableDEcricre){
                 if(mapping_rôle_utilisateurs.get(j).contains(u)){
                    uPeutecrire = true;
                }
}

                if (uPeutecrire){
                   historiques.add(m);
}
            else{
                new ActionNonAutoriseeException("vous ne pouvez pas écrire");
}

    }





    public int compareTo(Object T) {
        if(this == T){
            return 1;
        }
        else{
            return 0;
        }
    }
}
