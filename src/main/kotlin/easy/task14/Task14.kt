package easy.task14

import easy.task13.Task13

class Task14 {

    fun longestCommonPrefix(strs: Array<String>): String {
        var res = ""
        var count = 900000

        for (i in strs.indices){
            if (strs[i].length < count){
                count = strs[i].length
            }
        }
        if (count == 0){
            return res
        }

        for (i in 0..count-1){
            for (n in 1..strs.size-1){
                if (strs[0][i] != strs[n][i]){
                    return res
                }
            }
            res = strs[0].substring(0,i+1)
        }
        return res
    }
}

fun main(){
    val task14 = Task14()
    var qwe: Array<String> = arrayOf("flower","flow","flight")
    println( task14.longestCommonPrefix(qwe))
}