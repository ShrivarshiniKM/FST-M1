class Car:
    'This class represents a person'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        message = "{} {} is moving"
        print(message.format(self.manufacturer,self.model))

    def stop(self):
        message = "{} {} is Stopped"
        print(message.format(self.manufacturer, self.model))


bmw = Car("BMW", "Q7", "2024", "electric", "green")
benz = Car("Benz", "Q7", "2024", "Petrol", "Black")
toyota = Car("BMW", "Q7", "2024", "electric", "green")

bmw.accelerate()
bmw.stop()
benz.accelerate()
benz.stop()
toyota.accelerate()
toyota.stop()

