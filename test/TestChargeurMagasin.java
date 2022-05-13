import XML.ChargeurMagasin;
import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.FileNotFoundException;

public class TestChargeurMagasin {

    @Test
    public void t01_chargerMagasin_valide () throws FileNotFoundException {
        //préparation des données
        ChargeurMagasin cm = new ChargeurMagasin("musicbrainzSimple");
        int nbCdTest = 12;
        //méthode testée
        Magasin mag = cm.chargerMagasin();
        int nbCd = mag.getNombreCds();
        //vérification
        assertEquals(nbCdTest, nbCd, "meme nombre de Cd dans la liste cree");
    }

    @Test
    public void t02_chargerMagasin_nonValide (){
        //préparation des données
        ChargeurMagasin cm = new ChargeurMagasin("NomIncorrect");
        //méthode testée
        //vérification
        FileNotFoundException fichierException = assertThrows(
                FileNotFoundException.class,
                () -> {cm.chargerMagasin();}
        );
    }

}
