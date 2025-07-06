package practice

fun main() {
    print("Enter your Battery Percentage: ")
    var batteryPercentage = readln().toInt()

    while (batteryPercentage <= 20) {
        println("Plug in your Phone to Charge!!")
        batteryPercentage+=4
        println(batteryPercentage)
    }
    println("Charging Complete")
}