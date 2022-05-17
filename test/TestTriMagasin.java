import XML.ChargeurMagasin;
import donnees.Comparateur;
import donnees.ComparateurAlbum;
import donnees.ComparateurArtiste;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTriMagasin {
    @Test
    public void Test01_trieArtiste () throws FileNotFoundException {
        //préparation des données
        ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple");
        ComparateurArtiste ca = new ComparateurArtiste();
        int nbCdTest = 12;
        //méthode testée
        Magasin mag = cm.chargerMagasin();
        int nbCd = mag.getNombreCds();
        //vérification
        assertEquals(nbCdTest, nbCd, "meme nombre de Cd dans la liste cree");
        mag.trier(ca);
        assertEquals(nbCdTest, nbCd, "meme nombre de Cd dans la liste cree");
    }

    @Test
    public void Test02_trieAlbum () throws FileNotFoundException {
        //préparation des données
        ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple");
        ComparateurAlbum ca = new ComparateurAlbum();
        int nbCdTest = 12;
        //méthode testée
        Magasin mag = cm.chargerMagasin();
        int nbCd = mag.getNombreCds();
        //vérification
        assertEquals(nbCdTest, nbCd, "meme nombre de Cd dans la liste cree");
        mag.trier(ca);
        assertEquals(nbCdTest, nbCd, "meme nombre de Cd dans la liste cree");
        assertEquals(mag.getCd(0).getNomCD(), "Bénabar - Bénabar", "doit avoir le même nom");
    }
}
