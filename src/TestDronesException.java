public class TestDronesException {
  public static void main(String[] arg)  {
    try {
      // TEST 1
      DroneTerrestre d1 = new DroneTerrestre("Wall-E1", 11, 1); // nom adresse nbRoues
      System.out.println(d1);
    } catch (DroneTerrestreException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      // TEST 2
      DroneAerien d2 = new DroneAerien("Eve1", 21, -2.0f); // nom adresse hauteur
      System.out.println(d2);
    } catch (DroneAerienException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      // TEST 3
      Drone[] drones = null;
      Colonie colo = new Colonie(20, 20, drones);
      System.out.println(colo);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      // TEST 4
      DroneTerrestre d3 = new DroneTerrestre("Wall-E1", 11, 3); // nom adresse nbRoues
      Colonie colo2 = new Colonie(20, 20, new Drone[]{d3});
      System.out.println("les déplacements du drone sont : \n " + colo2.getDeplacements("Bizarre"));
    } catch (DroneTerrestreException e) {
      System.out.println(e.getMessage());
    } catch (DroneNonTrouveException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
