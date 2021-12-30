fun main() {

    /** First car with builder */
    val sportCar: Builder = CarBuilder()
    sportCar.run {
        setSeats(2)
    }

    /** Second car with builder */
    val suvCar: Builder = CarBuilder()
    suvCar.run {
        setSeats(6)
        setTransmission("SUV Transmission")
        setTripComputer("SUV Computer")
    }

    showCarSpecifications((sportCar as CarBuilder).getCar())
    showCarSpecifications((suvCar as CarBuilder).getCar())

}

fun showCarSpecifications(car: Car) {
    println("Seats: ${car.carSeats} | Transmission: ${car.carTransmission} | Trip Computer: ${car.carTripComputer}")
}
