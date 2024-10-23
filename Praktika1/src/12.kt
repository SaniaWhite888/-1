fun main(){
    println("5")
    println("10")
    println("21")
    println("Введите четыре числа:")
    val numbers3 = readLine()?.split(" ")
    if (numbers3 != null && numbers3.size == 4) {
        println(numbers3[0])
        println(numbers3[1])
        println(numbers3[2])
        println(numbers3[3])
    } else {
        println("Некорректный ввод.")
    }
}