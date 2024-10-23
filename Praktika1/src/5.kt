fun main(){
    println("Введите число:")
    val  imputNumber2=readLine()?.toIntOrNull()
    if (imputNumber2!=null) {
        println("$imputNumber2-Вот такое число Вы ввели")
    }else{
        println("Некоректный ввод.")
    }
}