package donnees;

public class ComparateurAlbum implements Comparateur{
    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        return (cd2.etreAvantAlbum(cd1));
    }
}
