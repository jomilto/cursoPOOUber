from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seatMaterial = []

    def __init_(self,license,driver,typeCarAccepted,seatMaterial):
        super.__init__(license,driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatMaterial = seatMaterial