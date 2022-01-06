class CarBuilder : Builder {

    var carSeats: Int = 0
    var carTripComputer: String = ""
    var carTransmission: String = ""

    override fun setSeats(seats: Int): Builder {
        carSeats = seats
        return this
    }

    override fun setTripComputer(computer: String): Builder {
        carTripComputer = computer
        return this
    }

    override fun setTransmission(transmission: String): Builder {
        carTransmission = transmission
        return this
    }

    fun getCar(): Car {
        return Car(carSeats, carTripComputer, carTransmission)
    }
}
