package Kotlin

import java.util.Scanner

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */

fun main(){
    var n:Int
    var k:Int=2
    val scanner=Scanner(System.`in`)
    println("Введите число")
    n=scanner.nextInt()
    while (n % k !=0){
        k++
    }
    println("Наименьший делитель равен: $k")

}