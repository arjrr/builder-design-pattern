## Builder (_Design Pattern_)
Exemplo de implementação do padrão de projeto _Builder_

## Definição

Segundo REFACTORING-GURU (2022):

"**O padrão Builder:** É um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção."

## O problema

"Imagine um objeto complexo que necessite de uma inicialização passo a passo trabalhosa de muitos campos e objetos agrupados. Tal código de inicialização fica geralmente enterrado dentro de um construtor monstruoso com vários parâmetros. Ou pior: espalhado por todo o código cliente." (REFACTORING-GURU, 2022)

## Solução

Segundo REFACTORING-GURU (2022), "O padrão Builder sugere que você extraia o código de construção do objeto para fora de sua própria classe e mova ele para objetos separados chamados builders."

## Estrutura

<img width="400" alt="Builder" src="https://user-images.githubusercontent.com/5003410/148385179-851b58fe-4ce7-4854-bc94-6c08c7712549.png">

<sup>Fonte: https://refactoring.guru/pt-br/design-patterns/builder</sup>

## Implementação

**Builder**

```kotlin
interface Builder {
    fun setSeats(seats: Int): Builder
    fun setTripComputer(computer: String): Builder
    fun setTransmission(transmission: String): Builder
    fun build(): Car
}
```

**Car**

```kotlin
data class Car(
    val carSeats: Int,
    val carTripComputer: String,
    val carTransmission: String
)
```

**CarBuilder**

```kotlin
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

```

**Main**

```kotlin
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

```

