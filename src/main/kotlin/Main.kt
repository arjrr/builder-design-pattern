fun main() {

    /** First car with builder */
    val sportCar = CarBuilder()
        .setSeats(2)
        .build()

    /** Second car with builder */
    val suvCar = CarBuilder()
        .setSeats(6)
        .setTransmission("SUV Transmission")
        .setTripComputer("SUV Computer")
        .build()

    showCarDetails(sportCar)
    showCarDetails(suvCar)
}

fun showCarDetails(car: Car) {
    println("Seats: ${car.carSeats} | Transmission: ${car.carTransmission} | Trip Computer: ${car.carTripComputer}")
}
