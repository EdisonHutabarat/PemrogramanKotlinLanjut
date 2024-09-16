//fun main(args: Array<String>) {
//    var maybeNumber: Int? = 15
//    maybeNumber = null
//    println(maybeNumber * 2) --> variabel maybeNumber tidak meggunakan  OPERATOR !!
//    var s1 = "Hello"
//    var s2: String? = "World"
//    println(s1.length)
//    println(s2.length)
//}
// KODE PROGRAM DIATAS SALAH DIKARENAKAN TIDAK MENGGUNAKAN OPERATOR !! agar fungsinya melewatkan nilai null.


fun main(args: Array<String>) {
    //Null safety
    //The !! operator
    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2)

    maybeNumber = null
    println(maybeNumber!! * 2)
}
