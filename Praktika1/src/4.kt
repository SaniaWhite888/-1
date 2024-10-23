fun main(){
    println("Введите число:")
    val  Number=readLine()?.toIntOrNull()
    if (Number!=null) {
        println("Вы ввели число:")
    }else{
        println("Некоректный ввод.")
    }
}