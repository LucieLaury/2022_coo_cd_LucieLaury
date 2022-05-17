package donnees;

public class ComparateurArtiste implements Comparateur{
    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        return (cd1.etreAvantArtiste(cd2));
    }
}
