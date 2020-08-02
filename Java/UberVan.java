import java.util.Map;

class UberVan extends Car {
    // Marca > Modelo y año
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;
    private Integer passengers;

    public UberVan(String license, Account driver,
                    Map<String, Map<String,Integer>> typeCarAccepted,
                    ArrayList<String> seatMaterial){
        super(license,driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;
    }

    public UberVan(String license, Account driver){
        super(license,driver);
    }

    @Override
    public void setPassenger(Integer p){
        if(p == 6){
            this.passengers = p;
        }else{
            System.out.println("Son muy pocos pasajeros")
        }
    }
}