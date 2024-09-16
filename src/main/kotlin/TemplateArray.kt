/**
 * class Array<T> private constructor() {
 * val size : int
 * operator fun get(index: Int): T
 * operator fun set(index: Int, value: T): Unit
 * operator fun iterator(): iterator<T>
 * //....
 * }
 */

fun main(args: Array<String>) {
//    Creates an array<String> With sizes 5 and values ["0", "1", "9", "16"]
    val asc = Array(5) {
        i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}