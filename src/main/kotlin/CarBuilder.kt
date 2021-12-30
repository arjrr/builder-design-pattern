class CarBuilder : Builder {

    var carSeats: Int = 0
    var carTripComputer: String = ""
    var carTransmission: String = ""

    override fun setSeats(seats: Int) {
        carSeats = seats
    }

    override fun setTripComputer(computer: String) {
        carTripComputer = computer
    }

    override fun setTransmission(transmission: String) {
        carTransmission = transmission
    }

    fun getCar(): Car {
        return Car(carSeats, carTripComputer, carTransmission)
    }
}
