fun main() {
    println("Введите три числа через пробел:")
    val numbers = readLine()?.split(" ")
    if (numbers != null && numbers.size == 3) {
        println("${numbers[0]}  ${numbers[1]}  ${numbers[2]}")
    } else {
        println("Некорректный ввод.")
    }
}