class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("Car license: " + this.license + " Name Driver: " + this.driver.name + " Pasajeros: " + this.passengers);
    }

    public Integer getPassengers(){
        return this.passengers;
    }

    public void setPassengers(Integer p){
        if(p == 4){
            this.passengers = p;
        }else{
            System.out.println("Son muy pocos pasajeros")
        }
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
            this.id = id;
    }

    public String getLicense(){
        return this.license;
    }

    public void setLicense(String license){
            this.license = license;
    }

    public String getDriver(){
        return this.driver;
    }

    public void setDriver(Account driver){
            this.driver = driver;
    }
}