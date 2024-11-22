public class DroneTerrestre extends Drone {
    private int nombreRoues;

    public DroneTerrestre(String nom, int adresseMAC, int nombreRoues) throws DroneTerrestreExc {
        super(nom, adresseMAC);
        if (nombreRoues < 2) {
            throw new DroneTerrestreExc("Le drone terrestre doit avoir au moins 2 roues.");
        }
        this.nombreRoues = nombreRoues;
    }

    @Override
    public void bouger(int numLigne, int numColonne) {
        if (Math.abs(this.position.getLigne() - numLigne) <= 1 && Math.abs(this.position.getColonne() - numColonne) <= 1) {
            super.bouger(numLigne, numColonne);
        } else {
            System.out.println("Déplacement non autorisé pour le drone terrestre.");
        }
    }
}