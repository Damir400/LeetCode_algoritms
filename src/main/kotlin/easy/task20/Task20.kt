package easy.task20

import easy.task14.Task14

class Task20 {

    fun isValid(s: String): Boolean {
        var str: String = s
        var mas: Array<String> = arrayOf("(", ")", "{", "}", "[", "]")


        if(s.length % 2 != 0){
            return false
        }
        for (i in 0..str.length-1){
            for (n in 0..4 step 2){
                if(str.first().toString() == mas[n+1] || str.last().toString() == mas[n]) {
                    return false
                }
                else if (i + 1 <=str.length-1 && str[i].toString() == mas[n] && str[i+1].toString() == mas[n+1]) {
                    str = str.removeRange(i, i + 2)
                    if (!str.isEmpty()) {
                        return isValid(str)
                    } else return true
                }
            }
        }
        return s.isEmpty()
    }

}

fun main(){
    val task20 = Task20()

    println( task20.isValid("(]"))
}

