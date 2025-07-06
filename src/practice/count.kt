package practice

fun main() {

    print("Enter the num to print till: ")

    var count = readln().toInt()

    for (i in 1..count){
        println(count)
        count--
    }

}