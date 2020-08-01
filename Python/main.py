from car import Car

def run():
    car = Car()
    car.license = "ASD1232"
    car.driver = "Enrique Perez"
    print(vars(car))

if __name__ == "__main__":
    run()