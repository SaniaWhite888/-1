fun main() {
    println("Введите четыре числа через пробел:")
    val numbers2 = readLine()?.split(" ")
    if (numbers2 != null && numbers2.size == 4) {
        println("${numbers2[0]} ${numbers2[1]} ${numbers2[2]} ${numbers2[3]}")
    } else {
        println("Некорректный ввод.")
    }
}