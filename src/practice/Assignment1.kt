package practice

//Assignment1 :4/07/2025
//topics - 1. Variable assignment
// 2. Arithmetic Operators
// 3. Relational Operators
// 4. Logical Operators

fun main(){
    val num1 = 10
    val num2 = 20

    //And (&&)
    println(num1<20 && num2>10)  //both are true - true
    println(num1>20 && num2<10)  //both are false - false
    println(num1<20 && num2==100)  //one statement is false - false


    //Not(!)
    println(!(num1 == num2))  //actually false but inverted gives true
    println(!(num1<100))  //actually true but inverted gives false


    //Or(||)
    println(num1 <20 || num2 >30) //one is true but the other is false - true
    println(num1 ==100 || num2==200)  //both are false - false
    println(num1 <20 || num2>= 20) //both are true - true

}