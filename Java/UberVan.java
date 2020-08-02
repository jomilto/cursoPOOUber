import java.util.Map;

class UberVan extends Car {
    // Marca > Modelo y año
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    public UberVan(String license, Account driver,
                    Map<String, Map<String,Integer>> typeCarAccepted,
                    ArrayList<String> seatMaterial){
        super(license,driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }
}