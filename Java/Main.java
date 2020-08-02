class Main {
    public static void main(String[] args) {
        Account driver = new Account("Enrique Perez", "EP21222");
        Car car = new Car("ASDAS1212", driver);
        car.id = 123;
        car.setPasengers(4);
        car.printDataCar();

        UberX uberX = new UberX("PRE12312",driver,"Chevrolet","Spark")
        uberX.id = 432;
        uberX.setPasengers(1);
        uberX.printDataCar();
    }
}