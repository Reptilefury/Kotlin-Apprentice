package `Functional Programming with Kotlin`

import kotlin.random.Random

/*
fun Random.randomStrength():Int{
    return nextInt(100) + 10
}
fun Random.randomDamange(Strength:Int): Int{
return (Strength * 0.1 + nextInt(10)).toInt()
}
fun Random.randomBlock():Boolean{
    return nextBoolean()
}*/
fun Random.randomStrength():Int{
    return nextInt(100) + 10
}
fun Random.randomDamange(strength:Int):Int{
    return (strength * 0.1 + nextInt(10)).toInt()
}
fun Random.randomBlock():Boolean{
    return nextBoolean()
}
fun String.print()= System.out.println(this)