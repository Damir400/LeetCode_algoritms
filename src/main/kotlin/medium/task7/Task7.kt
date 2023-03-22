package medium.task7

import medium.task29.Task29
import kotlin.math.pow

class Task7 {

    fun reverse(x: Int): Int {
        var qwe: Long = x.toLong()
        var symbol = 1
        var str = ""
        var result = ""

        if (qwe < 0){
            qwe = -qwe
            symbol = -1
        }

        str = qwe.toString()

        for (i in str.length-1 downTo  0){
            result += str[i]
        }
        qwe = result.toLong() * symbol

        if(qwe < (Math.pow((-2).toDouble(),(31).toDouble())).toInt()
                || qwe > (Math.pow((2).toDouble(),(31).toDouble())-1).toInt()){
            return 0
        }
        else return qwe.toInt()

    }
}

fun main(){
    val task7 = Task7()
    println( task7.reverse(123))
}