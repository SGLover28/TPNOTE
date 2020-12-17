import java.util.List;
import java.util.Map;

public class ServeurDiscussion {

Map<Rôle, List<Utilisateur>> mapping_role_utilisateur;

List<Canal> canaux;
String nom;
Map<Rôle, List<Habilitation>> mapping_role_habilitation;

    public ServeurDiscussion() {
    }

    public Map<Rôle, List<Utilisateur>> getMapping_role_utilisateur() {
        return mapping_role_utilisateur;
    }

    public void setMapping_role_utilisateur(Map<Rôle, List<Utilisateur>> mapping_role_utilisateur) {
        this.mapping_role_utilisateur = mapping_role_utilisateur;
    }

    public List<Canal> getCanaux() {
        return canaux;
    }

    public void setCanaux(List<Canal> canaux) {
        this.canaux = canaux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<Rôle, List<Habilitation>> getMapping_role_habilitation() {
        return mapping_role_habilitation;
    }

    public void setMapping_role_habilitation(Map<Rôle, List<Habilitation>> mapping_role_habilitation) {
        this.mapping_role_habilitation = mapping_role_habilitation;
    }
}
