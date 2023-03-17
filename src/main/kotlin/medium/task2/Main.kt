package medium.task2

class Main {


    fun lengthOfLongestSubstring(s: String): Int {
        var count = 0
        var map = mutableMapOf<Char, Int>()

        if(s.isEmpty()){
            return 0
        }
        else if(s.length == 1) {
            return 1
        }

        for(i in s.indices step 1) {
            if(map[s[i]] != null){
                val count2 = lengthOfLongestSubstring(s.substring(map[s[i]]!!+1))
                return if(count>count2) count else count2
            }
            count +=1
            map[s[i]]=i
        }

        return count
    }
}
fun main() {
 val main = Main()
 main.lengthOfLongestSubstring("abcbla")
}