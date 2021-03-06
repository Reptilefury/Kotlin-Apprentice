package `interface`

import jdk.incubator.vector.DoubleVector
import java.awt.geom.RectangularShape
import kotlin.math.PI

interface vehicle {
    fun Accelerating()
    fun Stop()
}

class Unicycle : vehicle {
    var peddling = false
    override fun Accelerating() {
        peddling = true
    }
    override fun Stop(){
        peddling = false
    }
}
class bus:vehicle{
    var speeding = false
    override fun Accelerating(){
       var  speeding = true
    }
    override fun  Stop(){
       var speeding= false
    }
}



class truck:vehicle{

    var speeding = false

    override fun Accelerating(){
        var speeding = true
    }
    override fun Stop(){
        var speeding = false
    }


}
enum class Direction{
    RIGHT,
    LEFT,
}
interface VehicleDirection{
    fun Accelerating()
    fun Stop()
    fun turn(direction: Direction)
    fun description():String
}
interface operationalDirectionVehicle{
    //fun Accelerating()
    //fun Stop()
    fun turn(direction: Direction)
    //fun description():String
}
class operationalDirection:operationalDirectionVehicle{
    override fun turn(direction: Direction) {
        println(direction)
    }
}
val car = operationalDirection()

interface SpaceVehicle{
    fun Accelerating()
    fun Stop(){
        println("whoa stop!!")
    }
}
interface WaterVessels{
    fun Sail()
    fun DropAnkor(){
        println("We are sinking Captain!!")
    }
}
class Yatch:WaterVessels{
    override fun Sail(){
        println("Rich people are sailing mate!!")
    }
}
class cargoShip: WaterVessels{
    override fun Sail() {
        println("Up and away!!")
    }

    override fun DropAnkor() {
        println("Yikes!!, we going down boys!! call for help!!")
    }
}

class LightFreighter: SpaceVehicle{
    override fun Accelerating(){
        println("Proceed to hyperSpace")
    }
}

class Starship : SpaceVehicle {
    override fun Accelerating() {
        println("Luke Iam your father!!")
    }

    override fun Stop() {
        super.Stop()
    }
}

interface VehicleProperties {
    val weight: Int
    val name: String
        get() = "Vehicle"
}

class Car : VehicleProperties {
    override val weight: Int = 2000
}

class Tank : VehicleProperties {
    override val weight: Int
        get() = 10000
    override val name: String
        get() = "Royce"
}

interface WheeledVehicle : vehicle {
    val numberOfWheels: Int
    val WheelSize: Double

}

class Bike : WheeledVehicle {
    var peddling = false
    var breaksApplied = false
    override val numberOfWheels: Int = 2
    override val WheelSize: Double
        get() = 40.0

    override fun Accelerating() {
        var peddling = true
        var breaksApplied = false
    }

    override fun Stop() {
        var peddling = false
        var breaksApplied = true
    }
}

class MotorBike : WheeledVehicle {
    var speeding = false
    var drifting = false
    override val numberOfWheels: Int = 2
    override val WheelSize: Double
        get() = 50.0

    override fun Accelerating() {
        var speeding = true
        var drifting = false
    }

    override fun Stop() {
        var speeding = false
        var drifting = false
    }
}

interface Area {
    val area: Double

}
interface Area2{
    val area:Double
}
//Implementing multiple interfaces
interface Wheeled{
    val numberOfWheels: Int
    val wheelSize:Double
}
class Tricycle:vehicle,Wheeled{
    override fun Accelerating() {
        TODO("Not yet implemented")
    }

    override fun Stop() {
        TODO("Not yet implemented")
    }

    override val numberOfWheels: Int
        get() = TODO("Not yet implemented")
    override val wheelSize: Double
        get() = TODO("Not yet implemented")

}

public interface Comparable<in T>{
    public operator fun compareTo(other:T):Int
}
public interface CompareTo<in T>{
    public operator fun compareTo(other:T):Int
}

interface SizedVehicle{
    var  length: Int
}

class Boat: SizedVehicle, Comparable<Boat>{
    override var length: Int = 0

    override fun compareTo(other: Boat): Int {
        return when{
            length > other.length -> 1
            length == other.length -> 0
            else -> -1
         }
    }



}
//cleanable, feedable, cagable, tankable, walkable,
interface cleanable{
    fun clean()
}
interface feedable{
    fun  feeding()
}
interface cagable:cleanable{
    fun  caging()
}
interface tankable{
    fun tanking()
}
interface walkable:cleanable{
    fun walking()
}


class dog:cagable, walkable, cleanable, feedable{
    override fun caging() {
      println("Cage this bad dog!!")
    }

    override fun walking() {
        println("Walking dog!!")
    }

    override fun clean() {
        println("clean this dog!!")
    }

    override fun feeding() {
        println("Let's feed this doggo!!")
    }

}
class cat:cleanable, feedable{
    override fun clean() {
    }

    override fun feeding() {
        println("Feeding this kitty!!")
    }

}
class fish:tankable, feedable{
    override fun feeding() {
        println("Feeding this cat fish man!!")
    }

    override fun tanking() {
        println("ok let's tank this mf!! up")
    }

}
class bird:cagable,feedable{
    override fun caging() {
      println("caging the bird  takes a skill!!")
    }

    override fun clean() {
        println("takes time to clean a cage!!")
    }

    override fun feeding() {
        println("Ok let's feed this bird!!")
    }

}

fun main() {
//dog, cat , fish , bird
    //create arrays
val Dog = dog()
val  Cat = cat()
val Fish =  fish()
val Bird = bird()

val walkingDuties:Array<walkable> = arrayOf(Dog)
val FeedableDuties: Array<feedable> = arrayOf(Bird, Dog, Cat, Fish)
val CagingDuties: Array<cagable> = arrayOf(Bird, Dog)
val CleaningDuties: Array<cleanable> = arrayOf(Dog, Cat,)
val TankingDuties: Array<tankable> = arrayOf(Fish)

//Walking, FeedingDuties, Caging, Cleaning,Tanking



    val Evergreen = Boat()
    Evergreen.length = 996

    val MVfaina = Boat()
     MVfaina.length = 888

    println(Evergreen > MVfaina)
    //println(titanic > qe2)

    val Maersk = Boat()
    Maersk.length = 990
    val MVFaina = Boat()
    MVFaina.length = 880
    println(Maersk > MVFaina)
    val cars = listOf("Lamborghini", "Ferrari", "Prado", "V8")
    val number = mapOf("Lena" to 1, "Anna" to 2, "Chloe" to 3, "Jenna" to 4)
    for (car in cars) {
        println(car)
    }
    for (qb in number) {
        println("${qb.key} wears ${qb.value}")
    }


    class Rectangle(val length: Double, val width: Double, val height: Double) : Area2 {
        override val area: Double
            get() = length * width * height
    }

    val rectangle = Rectangle(4.0, 5.0, 6.0)

    class Square(val side: Double) : Area {
        override val area: Double
            get() = side * side
    }

    class Triangle(val base: Double, val width: Double, val height: Double) : Area {
        override val area: Double
            get() = 0.5 * base * width * height
    }

    class Circle(val radius: Double) : Area {
        override val area: Double
            get() = PI * radius * radius
    }

    val square = Square(5.0)
    val triangle = Triangle(6.0, 4.0, 3.0)
    val circle = Circle(4.0)
    val shape = arrayOf(square,triangle,circle)
    println(shape.map { it.area })
    val StarWars = Starship()
    val richClass = Yatch()
    val MvFaina = cargoShip()
   // val falcon = LightFreighter()
    //println(StarWars.Accelerating())
   /* println(StarWars.Stop())
    println(richClass.Sail())
    println(MvFaina.DropAnkor())
    println(falcon.Accelerating())
    println(falcon.Stop())*/
    //println(car.turn(Direction.RIGHT))
        //println(car.turn(Direction.RIGHT))
}

//REPEAT and do default method implementations