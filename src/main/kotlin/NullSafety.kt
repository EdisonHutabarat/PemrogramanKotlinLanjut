fun main(args: Array<String>){
    //Nullable types
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}

// KESALAHAN PENERAPAN OPERATOR NULL
//fun main(args: Array<String>) {
//    var maybeNumber: Int? = 15
//    maybeNumber = null
//    println(maybeNumber * 2) --> terjadi kesalahan karena maybeNumber tidak menggunakan operator "?"
//    var s1 = "Hello"
//    var s2: String? = "World"
//    println(s1.length)
//    println(s2.length)
//}
