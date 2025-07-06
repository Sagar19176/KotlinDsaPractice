package practice
fun main(){
    print("Enter an interger: ")
    val num = readln().toInt()

    if(num %2 ==0){
        println("Even")
    }else{
        println("Odd")
    }
}