package practice

fun main(){
    score()

    bonusPoints(8)

   timeBonus(5,7)

}

fun score (){
    var goal = 0
    var score = 0
    for(i in 0..5){
        score++
        goal++
    }
    println(goal)
    println(score)
}

fun bonusPoints(bonus: Int){
    println(bonus)
}

fun timeBonus(tBonus : Int, bonus: Int){

    val totalBonus = bonus + tBonus
    println(totalBonus)
}