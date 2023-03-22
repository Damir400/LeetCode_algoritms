package easy.task28

import easy.task27.Task27

class Task28 {

    fun strStr(haystack: String, needle: String): Int { // "sadbutsad"     "sad"
        if (haystack.length < needle.length){
            return -1
        }
        for(i in 0 .. haystack.length-1){
            if(haystack[i] == needle[0] && (needle.length-2) < (haystack.length - 1 - i) &&
                haystack.substring(i,i+needle.length) == needle){
                return i
            }
        }
        return -1
    }
}

fun main(){
    val task28 = Task28()
    println( task28.strStr("hello", "ll"))
}