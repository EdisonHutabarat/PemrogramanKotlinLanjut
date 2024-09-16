fun main(args: Array<String>) {
    //panggil tanpa argumen
    connectToDb()
    println()
    //panggil dengan 2 argumen
    connectToDb("sqlserver", "edison")
}

fun connectToDb(hostname: String = "localhost",
                username: String = "mysql",
                password:String = "rahasia") {
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}