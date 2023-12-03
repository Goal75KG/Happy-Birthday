fun main() {
    val layers = 5

    val name = readLineOrEmpty("Type name here: ")
    val age = readIntInput("Type age here: ")

    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)

    println("Happy Your $age age Birthday, $name!")
}

// 读取用户姓名
fun readLineOrEmpty(prompt: String): String? {
    while (true) {
        try {
            print(prompt)
            val userInput = readlnOrNull()
            if (userInput == "32WYK") {
                throw Exception("You are banned!")

            } else return userInput
        } catch (e: Exception) {
            println(e.message)
        }

    }
}

// 读取用户年龄
fun readIntInput(prompt: String): Int {
    while (true) {
        try {
            print(prompt)
            return readlnOrNull()?.toInt() ?: throw NumberFormatException()
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid integer.")
        }
    }
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int) {
    print(" ")
    println(",".repeat(age))
    print(" ")
    println("|".repeat(age))
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        println("@".repeat(age + 2))
    }
    println()
}
