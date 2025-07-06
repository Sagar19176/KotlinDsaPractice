package practice

fun main(){
    val rows = 11
    for(i in 1..rows){
        for (j in i..rows){
            print('*')
        }
        println()
    }
}
