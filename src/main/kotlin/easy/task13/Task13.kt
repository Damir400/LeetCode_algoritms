package easy.task13

class Task13 {

    fun romanToInt(s: String): Int {
        var result = 0
        var map = mutableMapOf<String, Int>()
        var number = s

        map["M"] = 1000
        map["CM"] = 900
        map["D"] = 500
        map["CD"] = 400
        map["C"] = 100
        map["XC"] = 90
        map["L"] = 50
        map["XL"] = 40
        map["X"] = 10
        map["IX"] = 9
        map["V"] = 5
        map["IV"] = 4
        map["I"] = 1


        map.forEach{item ->

            while (number.startsWith(item.key)){
                result += item.value
                number = number.substring(item.key.length)
            }
        }

        return result
    }
}

fun main(){
    val task13 = Task13()
    println( task13.romanToInt("MCMXCIV"))
}