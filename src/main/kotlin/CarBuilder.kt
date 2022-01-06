class CarBuilder : Builder {

    private var carSeats: Int = 0
    private var carTripComputer: String = ""
    private var carTransmission: String = ""

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

    override fun build(): Car {
        return Car(carSeats, carTripComputer, carTransmission)
    }
}
