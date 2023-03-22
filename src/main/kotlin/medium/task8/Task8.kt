package medium.task8

import medium.task7.Task7

class Task8 {
    fun myAtoi(s: String): Int {
        var symbol = 1
        var str = ""
        var result: Long = 0
        var number = "123456789"
        var allNumber = "0123456789"

        for (i in 0 until s.length){

            if (s[i] == ' '){
                if(str.isNotEmpty()){
                    break
                }
                continue
            }
            else if (i+1 < s.length && (s[i] == '-' || s[i] == '+') && !allNumber.contains(s[i+1])){
                if(str.isNotEmpty()){
                    break
                }
                return 0
            }
            else if (s[i] == '+'){
                if(str.isNotEmpty()){
                    break
                }
                continue
            }
            else if(s[i] == '-'){
                if(str.isNotEmpty()){
                    break
                }
                symbol = -1
            }
            else if(number.contains(s[i])){
                str += s[i]
            }
            else if (i+1 < s.length &&  s[i] == '0' && !allNumber.contains(s[i+1]) && str.isEmpty()){
                return 0
            }
            else if (s[i] == '0' && str.isEmpty()){
                continue
            }
            else if (s[i] == '0' && str.isNotEmpty()){
                str += s[i]
            }
            else break
        }

        if (str.isEmpty()){
            return 0
        }
        else if(str.length-1 > 10){
            result = symbol * str.substring(0, 11).toLong()
        }
        else {
            result = symbol * str.toLong()
        }

        if(result < (Math.pow((-2).toDouble(),(31).toDouble())).toInt()){
            return (Math.pow((-2).toDouble(),(31).toDouble())).toInt()
        }
        else if (result > (Math.pow((2).toDouble(),(31).toDouble())-1).toInt()){
            return (Math.pow((2).toDouble(),(31).toDouble())-1).toInt()
        }
        else return result.toInt()
    }
}

fun main(){
    val task8 = Task8()
    println( task8.myAtoi("21474836++"))
}