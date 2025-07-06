package dsaPractice

fun findLeastNum(arr2: Array<Int>): Int{

    var min = arr2[0]
    for (num in arr2){
        if (num < min) min = num
    }
    return min

}

fun main(){
    val arr2 = arrayOf(5,4,1,7,9,6,3,99)

    println("Min number is: ${findLeastNum(arr2)}")
}