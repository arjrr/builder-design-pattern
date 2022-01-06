interface Builder {
    fun setSeats(seats: Int): Builder
    fun setTripComputer(computer: String): Builder
    fun setTransmission(transmission: String): Builder
    fun build(): Car
}
