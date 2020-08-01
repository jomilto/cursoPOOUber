from car import Car
from account import Account

def run():
    car = Car("ASD1232", Account("Enrique Perez", "EP123"))
    car.passengers = 4
    print(vars(car))
    print(vars(car.driver))

if __name__ == "__main__":
    run()