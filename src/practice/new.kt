package practice

fun main() {

    print("Please Enter Your Age :  ")
    val age = readln().toInt()

    if (age >= 150) {
        println("No, you are not eligible to vote!")
    } else if (age >= 18) {
        println("Yes, you are eligible to vote")
    } else if (age < 18) {
        println("You are underage!!")
    } else {
        print("Info not valid")
    }
}