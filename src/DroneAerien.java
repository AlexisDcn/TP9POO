public class DroneAerien extends Drone {
    private float hauteur;

    public DroneAerien(String nom, int adresseMAC, float hauteur) throws DroneAerienExc {
        super(nom, adresseMAC);
        if (hauteur <= 0) {
            throw new DroneAerienExc("La hauteur du drone aérien doit être positive.");
        }
        this.hauteur = hauteur;
    }

    public DroneAerien(String nom, int adresseMAC) throws DroneAerienExc {
        super(nom, adresseMAC);
        this.hauteur = 2.5f;
    }

    @Override
    public void bouger(int numLigne, int numColonne) {
        if ((Math.abs(this.position.getLigne() - numLigne) == 2 && this.position.getColonne() == numColonne) ||
            (Math.abs(this.position.getColonne() - numColonne) == 2 && this.position.getLigne() == numLigne)) {
            deplacements.add(this.position);
            this.position = new Case(numLigne, numColonne);
        } else {
            System.out.println("Déplacement non autorisé pour un drone aérien.");
        }
    }
}