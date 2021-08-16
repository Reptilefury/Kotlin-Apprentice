package `Chapter 11 classes`
fun main(args: Array<String>){
    data class  StudentData(var firstName: String, var lastName : String, var id: Int)
    val marie = StudentData("Marie", "Curie", 1)
    val emmy = StudentData("Emmy", "Noether", 2)
    val marieCopy = marie.copy()
    println(marie)
    println(emmy)
    println(marie == emmy)
    println(marie == marieCopy)
    println(marie === marieCopy)
    val (firstName, lastName, id) = marie
    println(firstName)
    println(lastName)
    println(id)

    class User(val firstName: String, var lastName: String)
    class  MovieList(var title: String, var description: String)
}
