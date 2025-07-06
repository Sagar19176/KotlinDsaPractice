package dsaPractice

fun findMax(arr1: Array<Int>): Int{
    var max = arr1[0]
    for (num in arr1) {
        if (num > max) max =num
    }
    return max

}

fun main(){

    val arr1 = arrayOf(3,6,8,1,5,9)

    println("Max: ${findMax(arr1)}")
}


