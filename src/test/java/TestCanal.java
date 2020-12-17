import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.fail;

public class TestCanal {



    @Test
    public void ecrireMessageOK() throws ActionNonAutoriseeException {
        // Etape 1 : préparation des objets
        Canal c = new Canal();

        Message m = new Message();
        m.setDestinataire(c);
        m.setTexte("Bonne fêtes de fin d'année !");

        Utilisateur utilisateur = new Utilisateur();
        c.getMapping_rôle_utilisateurs().put(new Rôle("Membre"), Arrays.asList(utilisateur));
        c.getMapping_rôle_habilitations().put(new Rôle("Membre"), Arrays.asList(Habilitation.ECRITURE));

        // Etape 2 : appel de la méthode testée
        c.ecrireMessage(utilisateur, m);

        // Etape 3 test du retour
        List<Message> historiques = c.getHistoriques();
        Assert.assertEquals(1, historiques.size());
        System.out.println(historiques.get(0).getTexte());
    }

    @Test(expected = Exception.class)
    public void ecrireMessageKO() {

        // Etape 1 : préparation des objets
        Canal c = new Canal();

        Message m = new Message();
        m.setDestinataire(c);
        m.setTexte("Bonne année 2021 !");

        Utilisateur utilisateur = new Utilisateur();

        // Etape 2 : appel de la méthode testée
        try {
            c.ecrireMessage(utilisateur, m);

            // Etape 3 test du retour
            fail("L'exception aurait du être levée, on ne doit pas passer ici !");
        } catch (ActionNonAutoriseeException e) {

            // Etape 3 test du retour = si on arrive ici, le test est concluant
        }
    }


    //Etape 7
    @Test
    public void testCompareOK(){
        Canal c = new Canal();
        Canal c1 = c;

        Assert.assertTrue(c.compareTo(c1) ==1 );
    }


    @Test
public void testCompareOk(){

        Canal c = new Canal();
        Canal c1 = new Canal();
        Assert.assertTrue(c.compareTo(c1) ==0);
    }
}
