package Kotlin

import java.util.Scanner

/*
Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
Стороны отверстия должны быть параллельны граням кирпича.
Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
Вернуть true, если кирпич пройдёт
*/

fun main(){
val a : Int
val b : Int
val c : Int
val r : Int
val s : Int
val scan=Scanner(System.`in`)
    println("Введите первую сторону кирпича")
    a=scan.nextInt()
    println("Введите вторую сторону кирпича")
    b=scan.nextInt()
    println("Введите третью сторону кирпича")
    c=scan.nextInt()
    println("Введите первую сторону отверстия")
    r=scan.nextInt()
    println("Введите вторую сторону отверстия")
    s=scan.nextInt()
    if (brickSize(a, b, c, r, s)){
        println("Кирпич проходит")
    }
    else{
        println("Кирпич не проходит")
    }

}
fun brickSize(a : Int,b : Int,c : Int,r : Int,s : Int):Boolean{

    return (a<=r && b<=s) || (b <= r && a <= s) ||
            (a <= r && c <= s) || (c <= r && a <= s) ||
            (c <= r && b <= s) || (b <= r && c <= s)
}

