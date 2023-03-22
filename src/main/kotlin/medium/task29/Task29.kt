package medium.task29

import easy.task28.Task28

class Task29 {
    fun divide(dividend: Int, divisor: Int): Int {
        var count = 0
        var div : Long
        var divis : Long

        if(dividend < 0){
            div = -dividend.toLong()
        } else div = dividend.toLong()

        if(divisor < 0){
            divis = -divisor.toLong()
        } else divis = divisor.toLong()

        if (div - divis < 0){
            return 0
        }

        if (dividend < (Math.pow((-2).toDouble(),(31).toDouble())).toInt()){
            return (Math.pow((-2).toDouble(),(31).toDouble())).toInt()
        } else if(dividend > (Math.pow((2).toDouble(),(31).toDouble())-1).toInt()){
            return (Math.pow((2).toDouble(),(31).toDouble())-1).toInt()
        }

        if (dividend == (Math.pow((-2).toDouble(),(31).toDouble())).toInt() && divisor == -1){
            return (Math.pow((2).toDouble(),(31).toDouble())-1).toInt()
        }

        if(divisor == 1 || divisor == -1){
            if(dividend > 0 && divisor > 0) return dividend
                else if (dividend < 0 && divisor < 0) return -dividend
                    else if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)){
                        if (dividend > 0){
                            return -dividend
                        }
                        else return dividend
                    }
        }

        while (div >= divis){
            div -= divis
            count++
        }
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
            count = -count
        }
        return count
    }
}

fun main(){
    val task29 = Task29()
    println( task29.divide(-102626058, -2147483648))
}