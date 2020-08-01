class Main {
    public static void main(String[] args) {
        Account driver = new Account("Enrique Perez", "EP21222");
        Car car = new Car("ASDAS1212", driver);
        car.id = 123;
        car.passengers = 4;
        car.printDataCar();
    }
}